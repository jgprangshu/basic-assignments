package basic_assignments;

import java.util.Scanner;

public class SimpleInterest {
	
public static void main(String[] args) {
	System.out.println("Enter the Principle amount");
	Scanner sc = new Scanner(System.in);
	int PRINCIPLE = sc.nextInt();
	
	
	System.out.println("Enter the Rate of Interest");
	
	int RATE = sc.nextInt();
	
	
	System.out.println("Enter the time duration");
	
	int TIME = sc.nextInt();
	
	int SIMPLEINTEREST = PRINCIPLE*RATE*TIME;
	System.out.println("The Simple Interest is "+SIMPLEINTEREST);
	
	sc.close();
}

}
