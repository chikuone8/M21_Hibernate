package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		//Lazy initialization
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		//create operation
		emp.setID(103);
		emp.setNAME("VIPUL");
		service.addEmployee(emp);
		
		/*reteive a data
		emp=service.getEmployeeById(102);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//update a data
		emp=service.getEmployeeById(102);
		emp.setNAME("SNEHAL");
		service.updateEmployee(emp);
		
		//retreive a data
		emp=service.getEmployeeById(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//delete a data
		emp=service.getEmployeeById(103);
		service.removeEmployee(emp);*/
		
		
		

	}

}