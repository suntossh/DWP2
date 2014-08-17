package com.baml.jersey.pojo;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	public Category(String name , Product product) {
		super();
		this.name = name;
		this.addProduct(product);
	}

	private List<Product> products = new ArrayList<Product>();
	private String name;
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
