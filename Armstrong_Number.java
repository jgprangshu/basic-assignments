package basic_assignments;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NUM = sc.nextInt();
		sc.close();
		int RESULT = NUM;
		int expo = NUM;
		double SUM = 0;
		int count = 0;
		while (expo > 0) {
			count++;
			expo = expo / 10;
		}

		while (RESULT > 0) {
			SUM = SUM + Math.pow(RESULT%10, count);
			RESULT = RESULT / 10;

		}

		if (NUM == SUM) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Not an armstrong number");
		}
	}
 
}
