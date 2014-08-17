package com.baml.jersey.pojo;

import java.util.ArrayList;
import java.util.List;


public class Shop {
	public Shop(String name, Category category) {
		super();
		this.name = name;
		this.addCategory(category);
	}
	
	private String name;
	private List<Category> categorys = new ArrayList<Category>();
	
	public List<Category> getCategory() {
		return categorys;
	}
	public void addCategory(Category category) {
		this.categorys.add(category);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
