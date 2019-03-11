package basic_assignments;

public class BubbleSort {
	public static void main(String[] args) {
		
		int inner;
		int outer;
		int temp;
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		for(inner=0;inner<15;inner++)
		{
			for(outer=0;outer<14-inner;outer++)
			{
				if(arr[outer]>arr[outer+1])
				{
					temp=arr[outer];
					arr[outer]=arr[outer+1];
					arr[outer+1]=temp;
				}
			}	
				
			}
		
			for(int print=0;print<15;print++)
			{
				System.out.print(arr[print]+ " ");
			}
		
		
	}

}
