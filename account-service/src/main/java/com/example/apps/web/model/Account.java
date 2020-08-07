package com.example.apps.web.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String password;
	private String name;
	
	public Account() {
		this(0, "Guest", "passw0rd");
	}
	
	public Account(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
}
