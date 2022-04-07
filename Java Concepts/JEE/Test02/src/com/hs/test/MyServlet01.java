package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet01 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		System.out.println(gender);
		String[] hobbies =req.getParameterValues("hobbies");
		for(String h:hobbies) {
			System.out.println(h);
		}
		UserAuth user = new UserAuth();
		try {
		boolean isAuthenticated = user.isAuthenticated(username, password);
		if(isAuthenticated) {
			out.print("<h2>Hello "+username+"</h2>");
		}else {
			out.print("<h2>Wrong Credentials</h2>");
		}
		}catch(Exception e) {}
	}

}
