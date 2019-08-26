package com.portpolio.api.mvc.controller;

import com.portpolio.api.config.environment.YmlConfig;
import com.portpolio.api.mvc.model.BoardForum;
import com.portpolio.api.mvc.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

	@Autowired
	private TestService testService;
	
	@Autowired
	private YmlConfig ymlConfig;
	/**
	 * 리스트
	 * @return
	 * @throws Exception 
	 */
	@GetMapping(value="/labs")
	public Page<BoardForum> LabsList() throws Exception {
		Pageable pageable = PageRequest.of(1, 5);
		Page<BoardForum> list = testService.getList(pageable);
		String test = ymlConfig.getName();
		System.out.println("가주아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ"+test);
		return list;
	}
	
	@PostMapping("/forums")
	public BoardForum insert(BoardForum boardForum) {
		
		BoardForum result = testService.insertForum(boardForum);
		
		return result; 
	}
	
	@PutMapping("/forums")
	public BoardForum update(BoardForum boardForum) {
		//BoardForum result = testService.updateForum(String forumSubject, String forumContent);
		return null;
	}
	
	@DeleteMapping("/forums")
	public int delete(String userName) {
		BoardForum b = new BoardForum();
		b.setUserName("test");
		testService.deleteForum(b.getUserName());
		return 1;
	}
	
	
}
