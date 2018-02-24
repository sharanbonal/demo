package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main
{
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		IEmployeeDao dao=(IEmployeeDao)context.getBean("empDao");
		Employee emp=new Employee();
		
		emp.setEmpId(1);
		emp.setEmpName("sharan");
		emp.setEmpSal(30000.0);
		dao.insertEmployee(emp);
		DriverManagerDataSource dataSource=(DriverManagerDataSource)context.getBean("dataSource");
		System.out.println(dataSource.getUrl());
		System.out.println(dataSource.getUsername());
		System.out.println(dataSource.getPassword());
		System.out.println(dataSource.getClass());
	}
}
