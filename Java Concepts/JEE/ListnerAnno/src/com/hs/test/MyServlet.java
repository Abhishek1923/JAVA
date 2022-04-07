package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myurl")
public class MyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	ServletContext ctx = getServletContext();
	System.out.println("context obj created");
	
	PrintWriter out = res.getWriter();
	out.print("<h2>Hello Events n Listner</h2>");
	
	}

}
