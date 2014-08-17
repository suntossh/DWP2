package com.baml.jersey.pojo;

public class Product {
	
	public Product(String name, String desc, float cost) {
		super();
		this.name = name;
		this.desc = desc;
		this.cost = cost;
	}
	
	private String name;
	private String desc;
	private float cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
