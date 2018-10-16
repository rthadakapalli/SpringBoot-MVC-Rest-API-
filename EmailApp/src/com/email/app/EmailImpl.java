package com.email.app;

import java.util.Random;
import java.util.Scanner;

public class EmailImpl implements EmailService {

	
	EmailModel obj = new EmailModel();
	
	@Override
	public EmailModel generateEmail(String x, String y) {
		
		obj.setFirstname(x);
		obj.setLastname(y);
		
		if (x.equalsIgnoreCase("rohit") && y.equalsIgnoreCase("thadakapalli")) {
			
			obj.setDepartment("development");
			System.out.println("New Email Id : " + x +"."+ y +"@"+ obj.getDepartment() +"."+"company.com" );
			
		} else if (x.equalsIgnoreCase("raj") && y.equalsIgnoreCase("kumar")) {
			
			obj.setDepartment("sales");
			System.out.println("New Email Id : " + x +"."+ y +"@"+ obj.getDepartment() +"."+"company.com" );
			
		} else if (x.equalsIgnoreCase("sona") && y.equalsIgnoreCase("thomas")) {
			
			obj.setDepartment("accounting");
			System.out.println("New Email Id : " + x +"."+ y +"@"+ obj.getDepartment() +"."+"company.com" );
		} 
		
		
		return obj;
	}
	

	

	@Override
	public char[] randomPassword(int length) {
		
		String s = "ABCDEFGHIJKLMNOP123456789!@#$%^&*()";
		
		Random rand = new Random();
		
		char[] password = new char[length];
		
		for (int i = 0; i <length; i++) {
			
			password[i] = s.charAt(rand.nextInt(s.length()));
		}
		
		System.out.print("Your Generated Password : ");
		
		return password;
	}
	
	
	
	

}
