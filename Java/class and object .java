package com.Logesh;
//class and object
class Employee {
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//Constructor
	Employee (int employeeId ,String employeeName,float employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName= employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	
	
	
	//Method 
	void display() {
		System.out.println("EmployeeId :" + employeeId);
		System.out.println("Employee Name :" + employeeName);
		System.out.println("Employee Salary :" + employeeSalary);
	}
}
public class class_object {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"LOGESH",20000.0f);
		emp1.display();
		
		Employee emp2 = new Employee(102,"Logesh",80000);
		emp2.display();
	}

}
