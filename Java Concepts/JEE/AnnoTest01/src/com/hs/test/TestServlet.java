package com.hs.test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/testurl")
@WebServlet(
        urlPatterns = "/testurl",
        initParams = {
                @WebInitParam(name = "jse", value = "corejava"),
                @WebInitParam(name = "jee", value = "advjava")
        }
)
public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.print("<h1>Hello Servlet with Annotations</h1>");
		ServletConfig sc = getServletConfig();
		System.out.println(sc.getInitParameter("jse"));
	
	}
 
}
