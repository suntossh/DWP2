package com.baml.jersey.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {

	public ShoppingMall(String name, Shop shop) {
		super();
		this.name = name;
		this.addShops(shop);
	}
	
	private String name;
	private List<Shop> shops = new ArrayList<Shop>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Shop> getShops() {
		return shops;
	}
	public void addShops(Shop shop) {
		this.shops.add(shop);
	}
	
	
}
