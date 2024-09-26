package com.ecommerce.model;

public class OrderDetail {
	private Integer id;
	private String name;
	private double amount;
	private double price;
	private double totalOrderDetail;
	
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(Integer id, String name, double amount, double price, double totalOrderDetail) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.totalOrderDetail = totalOrderDetail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalOrderDetail() {
		return totalOrderDetail;
	}

	public void setTotalOrderDetail(double totalOrderDetail) {
		this.totalOrderDetail = totalOrderDetail;
	}
}
