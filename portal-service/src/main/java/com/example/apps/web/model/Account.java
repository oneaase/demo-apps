package com.example.apps.web.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String password;
	private String username;
}
