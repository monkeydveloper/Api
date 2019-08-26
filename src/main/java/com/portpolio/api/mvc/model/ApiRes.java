package com.portpolio.api.mvc.model;

import java.util.List;

import lombok.Data;

@Data
public class ApiRes<T> {

	private String code;
	private String msg;
	
	private T data;	
	
	private List<T> list;
}
