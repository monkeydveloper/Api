package com.portpolio.api.mvc.service;

import com.portpolio.api.mvc.dao.TestDao;
import com.portpolio.api.mvc.model.BoardForum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;
	public Page<BoardForum> getList(Pageable pageable) {

		return testDao.findAll(pageable);
	}
	public BoardForum insertForum(BoardForum boardForum) {
		boardForum.setForumSubject("제목");
		boardForum.setForumContent("내용");
		boardForum.setUserName("이름");
		
		boardForum.setUserId(1);
		//BoardForum b = BoardForum.builder().forumSubject("제에목").forumContent("내에에용").userId(1).userName("이르으으음").build();
		return testDao.save(boardForum);
		
	}

	@Modifying
	@Query("update board_forum set forum_Subject = ?1 where u.lastname = ?2")
	public BoardForum updateForum(String forumSubject, String forumContent) {
		
		return null;
	}
	
	public void deleteForum(String userName) {
	
		testDao.deleteById(userName);
	}


}
