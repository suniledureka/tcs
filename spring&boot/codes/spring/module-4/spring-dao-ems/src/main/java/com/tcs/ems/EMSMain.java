package com.tcs.ems;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.ems.dto.Employee;
import com.tcs.ems.services.EmployeeService;

public class EMSMain {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employee-service");
		
		int empno;
		Employee emp;
		
		while(true)
		{
			System.out.println("1. New Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. All Employee");
			System.out.println("6. Exit");
			
			System.out.print("\nenter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				emp = getEmployee();
				service.saveEmployee(emp);
				break;
			 case 2:
				System.out.print("show the employee with no: ");
				empno = sc.nextInt();
				
				emp = service.searchEmployeeByNo(empno);
				if(emp != null) {
					System.out.println(emp);
				}else {
					System.out.println("@@@--- NO MATCHING EMPLOYEE FOUND ---@@@");
				}
				break;
			 case 3:
				System.out.println("logic to update employee"); 
				break;
			 case 4:
				System.out.print("enter employee no to delete: ");
				empno = sc.nextInt();
				emp = service.searchEmployeeByNo(empno);
				
				if(emp != null) {
					System.out.println(emp);
					System.out.print("do you want to delete this employee[Y/N]: ");
					String req = sc.next();
					if(req.equalsIgnoreCase("Y"))
						service.deleteEmployeeByNo(empno);
				}else {
					System.out.println("@@@--- NO MATCHING EMPLOYEE FOUND ---@@@");
				}
				break;
			 case 5:
				service.getAllEmployees(); 
				break;
			 case 6:
				System.out.println("^^^--- Application Closed ---^^^");
				sc.close();
				System.exit(0);
				break;
			 default:
				System.out.println("%%%--- INVALID OPTION --- TRY AGAIN ---%%%");				
			}//switch
			System.out.println("\n-----------------------------------------------------------------------");			
		}//while
	}
	
	
	
	private static Employee getEmployee() {
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("enter employee salary: ");
		float sal = sc.nextFloat();
		
		return new Employee(eno, name, sal);
	}
}
