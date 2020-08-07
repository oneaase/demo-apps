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

import com.example.apps.web.model.Order;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
	
	@GetMapping
	public List<Order> getAll() {
		// Mock process of get request
		List<Order> models = new ArrayList<Order>();
		models.add(new Order(1, "Test Order 00000001"));
		models.add(new Order(2, "Test Order 00000002"));
		return models;
	}
	
	@GetMapping("{id}")
	public Order getById(@PathVariable("id") int id) {
		// Mock process of get request
		return new Order(id, String.format("Test Order %08d", id));
	}

	@PostMapping
	public Order create(@RequestBody Order mockModel) {
		// Mock process of post request
		return mockModel;
	}
	
	@PutMapping
	public Order put(@RequestBody Order mockModel) {
		// Mock process of put request
		return mockModel;
	}
	
	@DeleteMapping
	public Order delete(@RequestBody Order mockModel) {
		// Mock process of post request
		return mockModel;
	}
}
