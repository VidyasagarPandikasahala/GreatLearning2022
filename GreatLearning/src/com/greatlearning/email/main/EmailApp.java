package com.greatlearning.email.main;
import java.util.Scanner;

import com.greatlearning.email.model.CredentialServicesImpl;
import com.greatlearning.email.model.Employee;

public class EmailApp {
	String Department;

	public static void main (String [] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your First Name");
		String firstName = obj.nextLine();
		System.out.println("Enter your Last Name");
		String lastName = obj.nextLine();
				
		Employee employeeData = new Employee(firstName, lastName);
		
		System.out.println (" 1. Technical");
		System.out.println (" 2. Admin");
		System.out.println (" 3. Human Resources");
		System.out.println (" 4. Legal");
		System.out.println("Please select an option");
		
		int option = obj.nextInt();
		
		
		CredentialServicesImpl credentialServices = new CredentialServicesImpl();
		
		switch (option){
		case 1:
			String emailTech = credentialServices.generateEmailAddress(employeeData, "tech" );
			char[] generatedPasswordTech = credentialServices.generatePassword();
			credentialServices.showCredential(employeeData, emailTech, generatedPasswordTech);
			break;
			
//		
		case 2:
			String emailAdmin = credentialServices.generateEmailAddress(employeeData, "admin" );
			char[] generatedPasswordAdmin = credentialServices.generatePassword();
			credentialServices.showCredential(employeeData, emailAdmin, generatedPasswordAdmin);
			break;
		case 3:
			String emailHr = credentialServices.generateEmailAddress(employeeData, "hr" );
			char[] generatedPasswordHr = credentialServices.generatePassword();
			credentialServices.showCredential(employeeData, emailHr, generatedPasswordHr);
			break;
		case 4:
			String emailLegal = credentialServices.generateEmailAddress(employeeData, "legal" );
			char[] generatedPasswordLegal = credentialServices.generatePassword();
			credentialServices.showCredential(employeeData, emailLegal, generatedPasswordLegal);
			break;
	}
		
	}	

}
		
