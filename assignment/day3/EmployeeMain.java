package com.capgemini.assignment.day3;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] employee=new Employee[4];
		Employee s1=new Employee(101,"swaroopa",9034.4);
		Employee s2=new Employee(102,"sakshi",8946.7);
		Employee s3=new Employee(103,"sreelu",7664);
		Employee s4=new Employee(104,"viju",74675.9);
employee[0]=s1;
employee [1]=s2;
employee [2]=s3;
employee [3]=s4;
		printEmployeeDetails(employee );
		Employee [] emp=getEmployee();
		printEmployeeDetails(emp);
		
		
	}
	static void printEmployeeDetails(Employee[] emp) {
	for(int i=0;i<emp.length;i++) {
		System.out.println("name - "+emp[i].name );
	System.out.println("id- "+emp[i].id);
	System.out.println("salary- "+emp[i].salary);
	System.out.println("***************************");
	}
	}
	static Employee[] getEmployee() {
		Employee [] employee =new Employee [4];
		Employee  s1=new Employee(101,"swapna",907.5);
		Employee  s2=new Employee(102,"sneha",896.7);
		Employee  s3=new Employee(103,"srija",7634);
		Employee  s4=new Employee(104,"vijji",7442.9);
		employee  [0]=s1;
		employee [1]=s2;
		employee [2]=s3;
		employee [3]=s4;
	return employee;
		
		
	}
	}
