package com.FilterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("Before Filter");
		
		
		String n = request.getParameter("name");
		if(n.startsWith("S")) {
			chain.doFilter(request, response);
			System.out.println("valid Name");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("FormFilter.html");
			rd.include(request, response);
			
			System.out.println("Invalid Name");
			out.println("Invalid Name, must start with S");
		}
		//...
		
		System.out.println("After Filter");
		
		//...
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}
}
