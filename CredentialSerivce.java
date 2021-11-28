package com.greatlearning.service;

import java.util.Random;

public class CredentialSerivce {

	public String generateEmailAddress (String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".companyname.com";

	}

	public String generatePassword() {
		String numbers = "1234567890";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "!@#$%^&*()<>?:";
		String values = numbers+smallLetters+capitalLetters+specialCharacters;
		Random random = new Random();
		char[] password = new char [8];
		for(int i=0;i<8;i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
			
		}
		return password.toString();
		
	}
	
	public void showCredentials (String email, String password) {
		System.out.println("Your Generated credentials are");
		System.out.println("Email:" + email);
		System.out.println("Password:" + password);
		System.out.println("\n");
		
	}
}
