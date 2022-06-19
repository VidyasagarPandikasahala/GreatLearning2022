package com.greatlearning.email.model;

import java.util.Random;

public class CredentialServicesImpl implements CredentialServices {

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		return emp.getfirstName().toLowerCase()+emp.getlastName().toLowerCase()+"@" +department +".greatlearning.com";
	}

	@Override
	public char[] generatePassword() {
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWX";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*<>+-/";
		String passwordRange = capitalLetters+smallLetters+numbers+specialCharacters;
	
		char[] password = new char[8]; // it will create space of 8 char
		
		for (int j =0; j<8 ;j++) {
			password[j] = passwordRange.charAt(random.nextInt(passwordRange.length()));
			
		}
		return password;
	}
	public void showCredential(Employee emp, String email,char[]generatedPassword) {
		
		System.out.println("Dear " +emp.getfirstName()+emp.getlastName() +" your generated credentials are as follows");
		System.out.println("E-mail---> " +email);
		System.out.println("Password---> " + generatedPassword);	
	}
	

}
