package com.baml.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.baml.jersey.pojo.Category;
import com.baml.jersey.pojo.Product;
import com.baml.jersey.pojo.Shop;
import com.baml.jersey.pojo.ShoppingMall;
import com.baml.jersey.restprocessor.Rest1Processor;

@Path("helloworld")
public class RestImplementer implements RestInterface{
	
	Rest1Processor rest1Processor= new Rest1Processor();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/message")
	public String getHello() {
		return RestInterface.CLICHED_MESSAGE;
	}
	
	@GET
	@Path("/Product")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct() {
		Product product = rest1Processor.getProduct("Shirt", "Apple Greene Provoge Dress Shirt", 100.0f);
		return product;
	}
	
	@GET
	@Path("/Category")
	@Produces(MediaType.APPLICATION_JSON)
	public Category getCategory() {
		Product product = rest1Processor.getProduct("Shirt", "Apple Greene Provoge Dress Shirt", 100.0f);
		Category category = rest1Processor.getCategory(product, "Clothing");
		return category;
	}
	
	@GET
	@Path("/Shop")
	@Produces(MediaType.APPLICATION_JSON)
	public Shop getShop() {
		Product product = rest1Processor.getProduct("Shirt", "Apple Greene Provoge Dress Shirt", 100.0f);
		Category category = rest1Processor.getCategory(product, "Clothing");
		Shop shop = rest1Processor.getShop(category, "Provoge");
		return shop;
	}
	
	@GET
	@Path("/Mall")
	@Produces(MediaType.APPLICATION_JSON)
	public ShoppingMall getShoppingMall() {
		Product product = rest1Processor.getProduct("Shirt", "Apple Greene Provoge Dress Shirt", 100.0f);
		Category category = rest1Processor.getCategory(product, "Clothing");
		Shop shop = rest1Processor.getShop(category, "Provoge");
		ShoppingMall shoppingMall = rest1Processor.getShoppingMall(shop, "Newport Mall");
		return shoppingMall;
	}
}
