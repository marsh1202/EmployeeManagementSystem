package Project_Structure;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import POJOclassTopic.Employee;

public class Employee_Operation {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> a1 = new ArrayList<>();
	static Employee e1 = new Employee();
	static void Create() {
		int count = 0;
		while(count ==0) {
			System.out.println("Enter the employee ID");
			e1.setId(sc.nextInt());
			System.out.println("Enter the Employee Name");
			e1.setName(sc.next());
			System.out.println("Enter the Employee Designation");
			e1.setDesignation(sc.next());
			a1.add(e1);
			System.out.println(e1.getId()+ "Employee Details Added successfully!!!...... ");
			System.out.println("Press 0 to add press 1 to exit");
			count = sc.nextInt();
			if(count==1) {
				System.out.println("**Thank You**");
			}
		}
	}
	public static void Read(int id)
	{
		Integer i1 = new Integer(id);
		if(i1.equals(e1.getId())) {
			System.out.println("Employee id is " + e1.getId());
			System.out.println("Employee Nmae is " + e1.getName());
			System.out.println("Employee Designation is "+ e1.getDesignation());
		}
		else
		{
			System.out.println("Empployee id is Invalid");
		}
	}
	public static void ReadAll(String all) {
		for(Employee employee :a1) {
			System.out.println();
		}
	}
	public static void Update(int id) {
		Integer i1 = new Integer(id);
		if(i1.equals(e1.getId())) {
			System.out.println("Eneter the employee Name");
			e1.setName(sc.next());
			System.out.println("Eneter the employee Designation");
			e1.setDesignation	(null);
			if(e1 != null) {
				System.out.println(e1.getId()+"Employee update Succesfully......");
			}		
		}}
	
	public static void Delete() {
		
	}
}
