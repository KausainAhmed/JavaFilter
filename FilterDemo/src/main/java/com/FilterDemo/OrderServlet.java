package com.FilterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ord")
public class OrderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		System.out.println("Order Servlet");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Order Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>This is order servlet</h1>");
		out.println("<h1>Servlet orderServlet at" + req.getContextPath() + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
