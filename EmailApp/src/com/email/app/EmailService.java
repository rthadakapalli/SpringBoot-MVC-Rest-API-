package com.email.app;

public interface EmailService {
	

	
	static int i = 0;
	
	public EmailModel generateEmail(String x, String y);
	
	public char[] randomPassword (int length);
	
	
	
	//public String changePassword (String pass);

}