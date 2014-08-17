package com.baml.jersey.filter;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

public class Rest3Filter  implements ContainerResponseFilter {

	

	@Override
	public ContainerResponse filter(ContainerRequest arg0,
			ContainerResponse arg1) {
		System.out.println("############### Rest3Filter RESPONSE FILTER STARTS##################");
		System.out.println(arg0.getRequestHeaders());
		System.out.println(arg0.getBaseUri());
		System.out.println(arg0.getRequestUri().getHost());
		System.out.println(arg0.getRequestUri().getPort());
		System.out.println("############### Rest3Filter  RESPONSE FILTER ENDS##################");
		arg1.getHttpHeaders().add("Name", "Santosh Pandey");
		arg1.getHttpHeaders().add("Salary", "250K Per month");
		return arg1;
	}

}
