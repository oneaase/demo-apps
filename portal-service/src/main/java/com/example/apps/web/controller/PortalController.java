package com.example.apps.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.example.apps.web.model.Account;
import com.example.apps.web.model.Order;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PortalController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${com.example.demo-apps.account-service.endpoint}")
	private String accountServiceEndpoint;
	
	@Value("${com.example.demo-apps.order-service.endpoint}")
	private String orderServiceEndpoint;
	
	@GetMapping
	public String getIndexView() {
		return "index";
	}
	
	@GetMapping("/account")
	public String getAllAccountView() {
		ResponseEntity<Account[]> response = restTemplate.getForEntity(accountServiceEndpoint, Account[].class);
		Account[] accounts = response.getBody();
		for (Account account : accounts) {
			log.info(account.getUsername());
		}
		
		return "index";
	}
	
	@GetMapping("/account/sign_up")
	public String getAccountSignUpView() {
		return "index";
	}
	
	@GetMapping("/account/sign_in")
	public String getAccountSignInView() {
		return "index";
	}
	
	@GetMapping("/account/sign_out")
	public String getAccountSignOutView() {
		return "index";
	}
	
	@GetMapping("/order")
	public String getAllOrderView() {
		ResponseEntity<Order[]> response = restTemplate.getForEntity(orderServiceEndpoint, Order[].class);
		Order[] orders = response.getBody();
		for (Order order : orders) {
			log.info(order.getName());
		}
		
		return "index";
	}
	
	@GetMapping("/order/search_item")
	public String getOrderSearchView() {
		return "index";
	}
	
	@GetMapping("/order/add_item")
	public String getOrderAddView() {
		return "index";
	}
	
	@GetMapping("/order/confirm")
	public String getOrderConfirmView() {
		return "index";
	}
	
	@GetMapping("/order/checkout")
	public String getOrderCheckoutView() {
		return "index";
	}
}
