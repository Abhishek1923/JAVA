package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("tarushi");
		PrintWriter out = res.getWriter();
		ctx.setAttribute("himanshu", "singh");
		out.print("<h2>"+name+"</h2>");
		
	}

}
