package com.ecommerce.model;

import java.util.Date;

public class Orden {
	private Integer id;
	private String number;
	private Date creationDate;
	private Date receivedDate;
	private double totalOrder;
	
	public Orden() {
	}

	public Orden(Integer id, String number, Date creationDate, Date receivedDate, double totalOrder) {
		super();
		this.id = id;
		this.number = number;
		this.creationDate = creationDate;
		this.receivedDate = receivedDate;
		this.totalOrder = totalOrder;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public double getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(double totalOrder) {
		this.totalOrder = totalOrder;
	}
}
