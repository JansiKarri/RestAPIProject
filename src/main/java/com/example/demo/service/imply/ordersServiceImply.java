package com.example.demo.service.imply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.models.orders;
import com.example.demo.repository.ordersRepository;
import com.example.demo.service.ordersService;
@Service

public class ordersServiceImply implements ordersService {
	@Autowired
    ordersRepository repo;
	@Override
	public orders addOrder(orders o) {
		
		return repo.save(o);
	}

	@Override
	public List<orders> getAllOrders() {
		
		return repo.findAll();
	}

	@Override
	public List<orders> addAllOrders(List<orders> ol){
		return repo.saveAll(ol);
	}
	@Override
	public orders getById(int id) {
		
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not found" +id));
	}

	@Override
	public orders getByEmail(String email) {
		
		return repo.findByEmail(email);
	}

	@Override
	public orders updateOrder(orders o, int id) {
		orders o1=getById(id);
		o1.setOrder_name(o.getOrder_name());
		o1.setAddress(o.getAddress());
		o1.setEmail(o.getEmail());
		o1.setCost(o.getCost());
		
		return repo.save(o1);
	}

	@Override
	public String deleteById(int id) {
		
		 repo.deleteById(id);
		 return "succesfully deleted id is : " +id;
	}

}
