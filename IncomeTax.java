package basic_assignments;

import java.util.Scanner;

public class IncomeTax {
	
	public static void main(String[] args) {
		
		int income = 0;
		int netIncome ;
		Scanner sc = new Scanner(System.in);
		income = sc.nextInt();
		sc.close();
		if(income>=0 && income<=180000)
		 {
			netIncome= 0;
			System.out.println("The incometax is"+netIncome);
		 }
		else if(income>=181001 && income<=300000)
		{
			netIncome= (int) (0.10*income);
			System.out.println("The incometax is"+netIncome);
		}
		else if(income>=300001 && income<=500000)
		{
			netIncome= (int) (0.20*income);
			System.out.println("The incometax is"+netIncome);
			
		}
		else
		{
			netIncome= (int) (0.30*income);
			System.out.println("The incometax is"+netIncome);
		}
	}

}
