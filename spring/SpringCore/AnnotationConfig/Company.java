package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class Company {

	public static void main(String[] args) {
		
//		ApplicationContext obj = new AnnotationConfigApplicationContext(Company.class);		
	
		BeanFactory obj = new AnnotationConfigApplicationContext(Company.class);		
		
		System.out.println(obj.getBean("emp"));
	
		
		System.out.println(obj.getBean("add"));
	
	}
	
	
}
