package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class First extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<h2>HI...<h2>");
		//HttpSession session = req.getSession();
		//session.setAttribute("jse", "core-java");
		//out.print("<a href=second>click here</a>");
		out.print("<a href=second?jse=core-java>click here</a>");
		
	}	
	
}
