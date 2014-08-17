package com.baml.jersey.filter;

import com.sun.jersey.core.header.InBoundHeaders;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

 
public class Rest1Filter implements ContainerRequestFilter {

	@Override
	public ContainerRequest filter(ContainerRequest arg0) {
		System.out.println("############### Rest1Filter FILTER STARTS##################");
		System.out.println(arg0.getRequestHeaders());
		System.out.println(arg0.getBaseUri());
		System.out.println(arg0.getRequestUri().getHost());
		System.out.println(arg0.getRequestUri().getPort());
		System.out.println("############### Rest1Filter FILTER ENDS##################");
		/*InBoundHeaders inBoundHeaders = new InBoundHeaders();
		inBoundHeaders.add("Name", "Santosh Pandey");
		inBoundHeaders.add("Salary biWeekly", "250 K");
		arg0.setHeaders(inBoundHeaders);*/
		return arg0;
	}

}
    