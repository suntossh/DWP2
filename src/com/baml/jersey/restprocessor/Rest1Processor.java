package com.baml.jersey.restprocessor;

import com.baml.jersey.pojo.Category;
import com.baml.jersey.pojo.Product;
import com.baml.jersey.pojo.Shop;
import com.baml.jersey.pojo.ShoppingMall;

public class Rest1Processor {

	public Product getProduct(String name, String desc, float cost){
		return new Product(name, desc, cost);
	}
	
	public Category getCategory(Product product, String name){
		return new Category(name, product);
	}
	
	public Shop getShop(Category category, String name){
		return new Shop(name, category);
	}
	
	public ShoppingMall getShoppingMall(Shop shop, String name){
		return new ShoppingMall(name, shop);
	}
	
	public static void main(String[] args) {
	}

}
