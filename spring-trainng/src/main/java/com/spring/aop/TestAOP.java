package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP
{
    @SuppressWarnings("resource")
    public static void main(String[] args) 
    {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/spring-aop.xml");
        EmployeeManager manager = ( EmployeeManager ) context.getBean("employeeManager");
 
       // manager.getEmployeeById(1);
         
        manager.createEmployee(new EmployeeDTO());
         
       // manager.deleteEmployee(100);
    }
}