package com.example.demo.service;

import java.util.List;

import com.example.demo.models.orders;

public interface ordersService {
	orders addOrder(orders o);
	List<orders> addAllOrders(List<orders> ol);
	List<orders> getAllOrders();
	orders getById(int id);
	orders getByEmail(String email);
	orders updateOrder(orders o, int id);
	String deleteById(int id);
	
	

}
