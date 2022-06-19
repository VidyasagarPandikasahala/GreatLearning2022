package com.greatlearning.email.model;

public interface CredentialServices {
	public String generateEmailAddress (Employee emp, String  department);
	public char[] generatePassword();
	public void showCredential(Employee emp, String  department,char[]generatedPassword);
	
}