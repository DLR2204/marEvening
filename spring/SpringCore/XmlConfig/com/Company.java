package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
	
	
	public static void main(String[] args) {
		
		ApplicationContext obj = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		System.out.println(obj.getBean("emp"));
		
	}

}
