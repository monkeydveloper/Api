package com.portpolio.api.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;

@Entity
@Data
public class Non_sns {
	@Id
	@Column(name = "_id")
	private String _id;

    private String pwd;
    @Getter
    @Column(name = "email")
    private String email;
    private String pwd_updated;
    private String hashlink;
    private int user_id;
    private int account_expired;
    private String authority;
    private int enable;

}
