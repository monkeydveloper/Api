package com.portpolio.api.mvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BoardForum {
	@Id
	private int forumId;
	private String forumSubject;
	private String forumContent;
	@Column(insertable=false, updatable=false)
	private Date forumCreated;
	private int userId;
	private String userName;
	private int forumHit;
}
