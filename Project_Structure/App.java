package Project_Structure;
import java.util.*;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Welcome to Employee Management System");
		int count = 0;
		while(count == 0) {
			Thread.sleep(2000);
			System.out.println("**Select your Choice**");
			System.out.println("**1.Creat The Employee Details**");
			System.out.println("**2.Read the Employee Details**");
			System.out.println("**3.Update the Employee Deatis**");
			System.out.println("**4.Delete the Employee Deatis**");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
			Employee_Operation.Create();
				System.out.println("Do you Want to perform further operation 0 for Exit 1");
				count = sc.nextInt();
				break;
			case 2:
				System.out.println("Do you want to get the Employee Details By Id press 1");
				System.out.println("Do you want to get All Employee Details press 2");
				if(sc.nextInt()==1){
					System.out.println("Enter the Id of the Employee");
					int id = sc.nextInt();
					Employee_Operation.Read(id);
				}else if(sc.nextInt()==2)
				{
					Employee_Operation.ReadAll("FetchAll");
				}
				else {
					System.out.println("Invalid output");
				}
				System.out.println("Do you Want to perform further operation press 0 for Exit press 1");
				count = sc.nextInt();
				break;
			case 3:
				System.out.println("Update the Employee Details By Id");
				int id=sc.nextInt();
			Employee_Operation.Update(id);
				System.out.println("Do you Want to perform further operation press 0 for Exit press 1");
				count=sc.nextInt();
				break;
			case 4:
				break;
			}
		}
	}
}
