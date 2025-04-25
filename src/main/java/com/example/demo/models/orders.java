package com.example.demo.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class orders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int order_id;
	@NotNull
	private String order_name;
	@NotNull
	private String email;
	@NotNull
	private String address;
	@NotNull
	private double cost;
	@Override
	public String toString() {
		return "orders [order_id=" + order_id + ", order_name=" + order_name + ", email=" + email + ", address="
				+ address + ", cost=" + cost + "]";
	}
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orders(int order_id, @NotNull String order_name, @NotNull String email, @NotNull String address,
			@NotNull double cost) {
		super();
		this.order_id = order_id;
		this.order_name = order_name;
		this.email = email;
		this.address = address;
		this.cost = cost;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
