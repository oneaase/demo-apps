package com.example.apps.web.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	public Order() {
		this(0, "Guest");
	}
	
	public Order(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
