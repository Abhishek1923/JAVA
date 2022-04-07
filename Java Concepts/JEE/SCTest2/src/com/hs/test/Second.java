package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String v1 = req.getParameter("p1");
		String v2 = req.getParameter("p2");
		System.out.println("from second "+v1+" "+v2);
		PrintWriter out = res.getWriter();
		out.print("<h2>response from SS "+v1+" "+v2+"</h2>");
	}
	
}
