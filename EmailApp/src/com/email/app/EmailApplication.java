package com.email.app;

import java.util.Scanner;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		EmailImpl xxx = new EmailImpl();
		
		System.out.println("Enter First Name :");
		
		if (sc.hasNext("raj")) {
			xxx.generateEmail("raj", "kumar");			
			System.out.println(xxx.randomPassword(10));
		} 
		else if (sc.hasNext("rohit")) {
			xxx.generateEmail("rohit", "thadakapalli");
			System.out.println(xxx.randomPassword(15));
		}
		else if (sc.hasNext("sona")) {
			xxx.generateEmail("sona", "thomas");
			System.out.print(xxx.randomPassword(20));
		} 
		else { System.out.println("Employee Unavailable"); 
			System.exit(0);
		}


		System.out.print("\nChange Password :");
		
		
		changePassword(s.next()); 
		
		System.out.println("\nSet New Mailbox size : ");
		setCapacity(s.nextInt());
		obj1.setName("\nDisplaying First Employee Details = "+"Rohit Thadakapalli, " );
		obj1.setAltemail("rohit.thadakapalli@gmail.com");
		System.out.println(obj1.getName() + obj1.getAltemail());
		obj1.setName("\nDisplaying Second Employee Details = "+"Raj Kumar, " );
		obj1.setAltemail("raj.kumar@gmail.com");
		System.out.println(obj1.getName() + obj1.getAltemail());
		obj1.setName("\nDisplaying Third Employee Details = "+"Sona Thomas, " );
		obj1.setAltemail("sona.thomas@gmail.com");
		System.out.println(obj1.getName() + obj1.getAltemail());
		System.out.println("\nDisplaying Mailbox Size = " + obj1.getCapacity());
		s.close();
	}
	

	static Scanner s = new Scanner(System.in);
	static EmailModel obj1 = new EmailModel();
	
	public static String changePassword(String pass) {
		

		obj1.setChangePass(pass);
		System.out.println("New Password:" + obj1.getChangePass());
		return pass;
	}
	
	
	public static int setCapacity(int size) {
		
		obj1.setCapacity(size);
		System.out.println("New Size : " + obj1.getCapacity());
		return size;
	}

}
