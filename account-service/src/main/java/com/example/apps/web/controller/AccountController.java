package com.example.apps.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.apps.domain.repository.AccountRepository;
import com.example.apps.domain.model.Account;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping
	public List<Account> getAll() {
		return accountRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Account getById(@PathVariable("id") Integer id) {
		Optional<Account> accountOpt = accountRepository.findById(id);
		
		if (accountOpt.isPresent()) {
			return accountOpt.get();
		} else {
			return null;
		}
	}

	@PostMapping
	public Account create(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
	@PutMapping
	public Account put(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@RequestBody Account account) {
		accountRepository.deleteById(account.getId());
	}
}
