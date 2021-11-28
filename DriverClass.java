package com.greatlearning.model;
import java.util.Scanner;
import com.greatlearning.main.Employee;
import com.greatlearning.service.CredentialSerivce;

public class DriverClass {

	public static Employee employee = new Employee("Pruthviraj", "Nadiger");
	public static Scanner scanner = new Scanner(System.in);
	public static CredentialSerivce credentialService = new CredentialSerivce();
		
	public static void main (String[] args){

	displaymenu();
	int userChoice = scanner.nextInt();
	String emailAddress="";
	String password = "";
	String department = "";
	switch(userChoice) {
	case 1: department = "tech"; break;
	case 2: department = "adm"; break;
	case 3: department = "hr"; break;
	case 4: department = "lg"; break;	
	default:System.out.println("Invalid Choice");
	}
	if (!department.isEmpty()) {
		emailAddress = credentialService.generateEmailAddress(employee.getFirstName(),
				employee.getLastName(), department);
		password = credentialService.generatePassword();
		credentialService.showCredentials(emailAddress, password);
	}
	System.out.println("Your Department:" + userChoice +": " + department);
}

private static void displaymenu() {
	// TODO Auto-generated method stub
	System.out.println("Please enter the department from the following");
	System.out.println("1.Technical"+"\n"+"2.Admin"+"\n"+"3.Human Resource"+"\n"+
						"4.Legal");
	
	}	
}