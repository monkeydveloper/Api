package com.portpolio.api.config.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.portpolio.api.config.environment.YmlConfig;
import com.portpolio.api.mvc.model.ApiRes;

/**
 * @author Sieun, Lim
 * 컨트롤러를 통하는 프로젝트의 에러를 감지한다.
 */


@RestControllerAdvice
public class ErrorHandler {
	
	private final static Logger logger = LoggerFactory.getLogger(ErrorHandler.class);
	
	@Autowired
	private YmlConfig ymlConfig;
	
	public ErrorHandler(YmlConfig ymlConfig) {
		this.ymlConfig = ymlConfig;
	}
	
    private void printError(Throwable e){
    	
    	logger.error("[Exception]=======================================================");
		logger.error("[Exception Error] {}",e.getClass()+":"+e.getMessage());
		if(e.getStackTrace().length!=0){
			logger.error("[Error Trace] {}",e.getStackTrace()[0]);
			//에러추적
			if(ymlConfig.getName().equals("localServer")) {
				e.printStackTrace();
			}
		}
		logger.error("==================================================================");
	}
    
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler
	public ApiRes<Object> restOfError(Exception e) {
    	printError(e);
    	ApiRes<Object> res = new ApiRes<Object>();
    	res.setCode("500");
    	res.setMsg("API 서버 에러");
		return res;
	}
}
