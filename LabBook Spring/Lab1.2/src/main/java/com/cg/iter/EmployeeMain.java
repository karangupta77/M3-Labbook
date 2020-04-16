package com.cg.iter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;



public class EmployeeMain {
	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	 Class configurationClass=JavaConfig.class;
     context.register(configurationClass);
     context.refresh();

     Employee employee = context.getBean(Employee.class);
     System.out.println("Employee details");
     System.out.println("----------------------");
     employee.display();
     
     EmployeeMain em = new EmployeeMain();
     SBU sbu1=employee.getSbuDetails();
     em.printSBUDetails(sbu1);
	}
	
	void printSBUDetails(SBU sbu) {
		System.out.println("sbu details= SBU "+"["+"sbuCode:"+sbu.getSbuId()+", "+"sbuHead:"+sbu.getSbuHead()+", "+"sbuName:"+sbu.getSbuName()+"]]");
	}

}