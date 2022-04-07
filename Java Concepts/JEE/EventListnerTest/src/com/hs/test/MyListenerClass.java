package com.hs.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListenerClass implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("intialized");
	}

}
