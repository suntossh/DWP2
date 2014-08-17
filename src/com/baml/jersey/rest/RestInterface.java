package com.baml.jersey.rest;

import com.baml.jersey.pojo.Category;
import com.baml.jersey.pojo.Product;
import com.baml.jersey.pojo.Shop;
import com.baml.jersey.pojo.ShoppingMall;

public interface RestInterface {

	String CLICHED_MESSAGE = "Hello World!!!";

	public abstract String getHello();

	public abstract Product getProduct();

	public abstract Category getCategory();

	public abstract Shop getShop();

	public abstract ShoppingMall getShoppingMall();

}
