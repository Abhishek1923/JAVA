package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletTest extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletConfig sc = getServletConfig();
		String driver = sc.getInitParameter("driver");
		PrintWriter out = res.getWriter();
		out.print("<h2>Driver Name "+driver+"</h2>");
		
	}

}
