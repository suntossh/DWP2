package com.baml.jersey.filter;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

public class Rest2Filter  implements ContainerRequestFilter {

	@Override
	public ContainerRequest filter(ContainerRequest arg0) {
		System.out.println("############### Rest2Filter FILTER STARTS##################");
		System.out.println(arg0.getRequestHeaders());
		System.out.println(arg0.getBaseUri());
		System.out.println(arg0.getRequestUri().getHost());
		System.out.println(arg0.getRequestUri().getPort());
		System.out.println("############### Rest2Filter FILTER ENDS##################");
		return arg0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
