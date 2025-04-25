package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.orders;
import com.example.demo.service.ordersService;

@RestController
@RequestMapping("/api/v1")
public class ordersController {
@Autowired
ordersService service;
@PostMapping("/insert")
public ResponseEntity<orders> insertion(@RequestBody orders o) {
	orders o1=service.addOrder(o);
	return new ResponseEntity<orders>(o1,HttpStatus.ACCEPTED);
}
@PostMapping("/addall")
public ResponseEntity<List<orders>>  addAllOrders(@RequestBody List<orders> ol){
	List<orders> ol1=service.addAllOrders(ol);
	return ResponseEntity.ok(ol1);
}


@GetMapping("/getall")
public ResponseEntity<List<orders>> getAllOrders(){
	return ResponseEntity.ok(service.getAllOrders());
	
}

@GetMapping("/getbyid/{id}")
public ResponseEntity<orders> getById(@PathVariable int id){
	return ResponseEntity.ok(service.getById(id));
}

@DeleteMapping("/deletebyid/{id}")
public ResponseEntity<String> deleteById(@PathVariable int id){
	return ResponseEntity.ok(service.deleteById(id));
}

@PutMapping("/update/{id}")
public ResponseEntity<orders> updateOrder(@PathVariable int id,@RequestBody orders o){
	return ResponseEntity.ok(service.updateOrder(o, id));
}
}
