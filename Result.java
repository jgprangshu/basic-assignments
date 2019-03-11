package basic_assignments;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		

		System.out.println("Enter the marks in 1st Subject");
		Scanner sc = new Scanner(System.in);
		double subjectA = sc.nextInt();
		
		System.out.println("Enter the marks in 2nd Subject");
		
		double subjectB = sc.nextInt();
		
		System.out.println("Enter the marks in 3rd Subject");
		
		double subjectC = sc.nextInt();
		sc.close();
		
		if(subjectA > 60 && subjectB > 60 && subjectC > 60)
		{
			
			System.out.println("The student has passed!!");
		}
		
		else if(subjectA > 60 && subjectB > 60 || subjectC > 60 && subjectA >60 || subjectC > 60 && subjectB >60 )
		{
			
			System.out.println("The student has been promoted !");
		}
		
		else
		{
			System.out.println("The student has failed ");
		}
		
		
	}

}
