package com.iontrading.learning.tradeLearning;

public interface ITrade {
	
	public int getId();
	public void setId(int id);
	public int getQuantity();
	public void setQuantity(int quantity);
	public String getClient();
	public void setClient(String client);
	public String getType();
	public void setType(String productType);
	
}
