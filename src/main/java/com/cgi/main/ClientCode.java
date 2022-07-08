package com.cgi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgi.main.config.SpringAppConfiguration;

public class ClientCode {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringAppConfiguration.class);
		Employee employee=context.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}
