package test1;
public class NumberSeries {

	public static void main(String[] args) {
	
		//2 12 36 80 150 252 upto 10 terms.
	
		 int sum=0;
		 for (int i=1;i<=10;i++)
		 {
			 sum=i*i + i*i*i;
			 System.out.print(sum+" ");
		 }
		 

	}

}
