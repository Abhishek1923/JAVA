package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			
		ServletContext ctx = getServletContext();
		String name = (String)ctx.getAttribute("himanshu");
		System.out.println(name);
		PrintWriter out = res.getWriter();
		out.print("<h2>Hello Servlet 2</h2>");
	}

}
