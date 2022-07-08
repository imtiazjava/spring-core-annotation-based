package com.cgi.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cgi.main.Employee;

@Configuration
public class SpringAppConfiguration {

	@Bean(value = "emp")
	public Employee getEmployee() {
		Employee emp = new Employee();
		// invoke setter method to initialized the data
		emp.setId(1001);
		emp.setName("RAJU");
		emp.setSalary(30000);
		return emp;
	}
}
