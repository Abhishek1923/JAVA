package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String val1 = "java";
		String val2 = "jee";
		PrintWriter out = res.getWriter();
		out.print("<h2>Response from First</h2>");
		System.out.println("from First before redirect");
		res.sendRedirect("http://localhost:2255/SCTest2/second?p1=val1&p2=val2");
		//res.sendRedirect("http://localhost:2255/SCTest2/second?p1="+val1+"&p2="+val2);
		System.out.println("from First after redirect");
		//http://localhost:2255/SCTest2/second?p1=java&p2=jee
		//http://localhost:2255/SCTest2/second
	}

	
	
}
