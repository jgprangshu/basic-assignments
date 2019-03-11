package basic_assignments;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		
		System.out.println("Enter the Principle amount");
		Scanner sc = new Scanner(System.in);
		double PRINCIPLE = sc.nextInt();
		
		System.out.println("Enter the Rate of Interest");
		
		double RATE = sc.nextInt();
		
		System.out.println("Enter the time duration");
		
		double TIME = sc.nextInt();
		
		
		sc.close();
		
		
		double Amount = PRINCIPLE* (Math.pow ((1+ RATE/100), TIME));
		double simpleInterest = Amount - PRINCIPLE ;
		System.out.println("The compound Interest is "+simpleInterest);
	}

}
