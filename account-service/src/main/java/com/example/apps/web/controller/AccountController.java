package com.example.apps.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apps.web.model.Account;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
	
	@GetMapping
	public List<Account> getAll() {
		// Mock process of get request
		List<Account> models = new ArrayList<Account>();
		models.add(new Account(1, "Test Account 00000001", "passw0rd"));
		models.add(new Account(2, "Test Account 00000002", "passw0rd"));
		return models;
	}
	
	@GetMapping("{id}")
	public Account getById(@PathVariable("id") int id) {
		// Mock process of get request
		return new Account(id, String.format("Test Account %08d", id), "passw0rd");
	}

	@PostMapping
	public Account create(@RequestBody Account account) {
		// Mock process of post request
		return account;
	}
	
	@PutMapping
	public Account put(@RequestBody Account account) {
		// Mock process of put request
		return account;
	}
	
	@DeleteMapping
	public Account delete(@RequestBody Account account) {
		// Mock process of post request
		return account;
	}
}
