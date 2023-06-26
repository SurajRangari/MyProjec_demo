package array;
import java.util.Scanner;
public class SumOfOddElement {
	public static void oddSum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			if(x%2!=0)
			{
				sum=sum+x;
			}
		}System.out.println("sum="+sum);
		
	}

	public static void main(String[] args) {
	
      
        int a[]= {3,6,9,7,4,5};
     
        SumOfOddElement.oddSum(a);
	}

}
