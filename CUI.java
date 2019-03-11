package basic_assignments;

import java.util.Scanner;

public class CUI {
	public static void main(String[] args) {
		
		String name="Prangshu";
		String password ="ABCD";
		int loginAttempts=0;
		
		for(loginAttempts=0;loginAttempts<3;loginAttempts++) {
		System.out.println("Enter the user name");
		Scanner sc = new Scanner(System.in);
		String inputName = sc.nextLine();
		System.out.println("Enter the password");
		String inputPassword = sc.nextLine();
		
		

		if(name.equalsIgnoreCase(inputName) && password.equalsIgnoreCase(inputPassword))
		{
			System.out.println("Welcome "+name);
			System.exit(0);
		}
		}
		System.out.println("Contact the Admin");
		System.exit(0);
		
		}
	
}

