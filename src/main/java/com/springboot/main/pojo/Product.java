package com.springboot.main.pojo;

public class Product {

	
	private int id;
	
	private String name;
	
	private long price;
	
	private int categoryid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public Product(int id, String name, long price, int categoryid) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoryid = categoryid;
	}

	
	public Product() {
		
	}
	
	
}
