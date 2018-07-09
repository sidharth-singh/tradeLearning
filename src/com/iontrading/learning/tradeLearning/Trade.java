package com.iontrading.learning.tradeLearning;

public class Trade implements ITrade {
	
	private int id;
	private int quantity;
	private String client;
	private String productType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getType() {
		return productType;
	}
	public void setType(String productType) {
		this.productType = productType;
	}
	
	

}
