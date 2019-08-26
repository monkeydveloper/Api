package com.portpolio.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class) // web app 구동
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //랜덤 포트로 실제 서블릿을 제공하여 테스트한다 없을경우 MOCK
@AutoConfigureMockMvc
public class ApiApplicationTests {

	@Autowired
	MockMvc mock;
	
	@Test
	public void contextLoads() {
		System.out.println("testing");
		assertThat(mock).isNotNull();
	}

}
