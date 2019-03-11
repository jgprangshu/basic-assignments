package basic_assignments;

import java.util.Scanner;

public class Searching {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int i;
	int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
	System.out.println("Enter the number to be searched");
	int search = sc.nextInt();
	sc.close();
	for(i=0;i<15;i++) {
	
	if(arr[i]==search) {
		System.out.println("The search no. is found at position " +(i+1));
		break;
	}
	else if(arr[i]==arr[14])
	{
		System.out.println("The number is not in the array");
	}
	}
	
}
}



