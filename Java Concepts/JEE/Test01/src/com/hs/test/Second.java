package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		String s = (String)ctx.getInitParameter("driver");
		PrintWriter out = res.getWriter();
		String name = (String)ctx.getAttribute("name");
		String ctxpath = ctx.getContextPath();
		System.out.println(name);
		out.print("<h2>"+s+" "+ctxpath+"</h2>");
	}

}
