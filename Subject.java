package basic_assignments;
import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		System.out.println("How much studentA score in maths hindi and science respectively");
		Scanner sc=new Scanner(System.in);
		int aMaths=sc.nextInt();
		int aHindi=sc.nextInt();
		int aScience=sc.nextInt();
		
		System.out.println("How much studentB score in maths hindi and science respectively");
		int bMaths=sc.nextInt();
		int bHindi=sc.nextInt();
		int bScience=sc.nextInt();
		
		System.out.println("How much studentC score in maths hindi and science respectively");
		int cMaths=sc.nextInt();
		int cHindi=sc.nextInt();
		int cScience=sc.nextInt();
		sc.close();
		
		int mathsAvg=(aMaths+bMaths+cMaths)/3;
		System.out.println("Total Average score in maths is"+" "+mathsAvg);
		
		int hindiAvg=(aHindi+bHindi+cHindi)/3;
		System.out.println("Total Hindi average score is"+" "+hindiAvg);
		
		int scAvg=(aScience+bScience+cScience)/3;
		System.out.println("Total Science average score is"+ " "+ scAvg);
		
		int aAvg=(aHindi+aMaths+aScience)/3;
		System.out.println("Average of rahul is"+" "+aAvg);
		
		int bAvg=(bHindi+bMaths+bScience)/3;
		System.out.println("Average of kenny is"+" "+bAvg);
		
		int cAvg=(cHindi+cMaths+cScience)/3;
		System.out.println("Average of xyp9x is"+" "+cAvg);
	}
}
