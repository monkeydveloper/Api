package com.portpolio.api.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portpolio.api.mvc.model.BoardForum;

public interface TestDao extends JpaRepository<BoardForum, String>{

}
