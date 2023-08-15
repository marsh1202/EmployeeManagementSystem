package POJOclassTopic;
import java.util.*;
public class Application {
	static ArrayList<Employee>a1=new ArrayList<Employee>();
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to employee management system");
	Thread.sleep(3000);
	System.out.println("Enter the number of employees to be added");
	int count =0;
	while(count == 0) {
		Employee e1=new Employee();
	
	System.out.println("Enter the employee id");
	e1.setId(sc.nextInt());
	System.out.println("Enter the employee name");
	e1.setName(sc.next());
	System.out.println("Enter the employee email");
	e1.setEmail(sc.next());
	System.out.println("Enter the employee designation");
	e1.setDesignation(sc.next());
	System.out.println("Enter the employee number");
	e1.setPhone(sc.nextLong());
a1.add(e1);
if(!a1.isEmpty()) {
	System.out.println(e1.getId() + "Employee added succesfully");
	System.out.println("Do you want to add more employee details...press 0 if yes and 1 for exit");
	count=sc.nextInt();
	if(count ==1) {
		System.out.println(a1);
		System.out.println("***Thank you***");
	}
}
}																									
}}
