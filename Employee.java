package com.demo;

public class Employee {

	//User defined class , Domain class, Model class, Entity class
	
		
		//instance variables
		public  int employeeId;   //Camel casing
		public String employeeName;
		public double employeeSalary;
		
		//constructor
		public Employee() {
			System.out.println("Constructor invoked...");
			// TODO Auto-generated constructor stub
		}
        
		
		
		public Employee(int employeeId, String employeeName, double employeeSalary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}



		//methods
		public void drawSalary()
		{
			System.out.println("Salary drawn...");
		}
		
		public void login()
		{
			System.out.println("logged in...");
		}

		public void logout()
		{
			System.out.println("logged out...");
		}
		
		public void applyLeave(int days)
		{
			System.out.println("Applied leave for "+days+" days...");
		}
		
	}


