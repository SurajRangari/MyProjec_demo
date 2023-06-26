package test1;

public class Factorial {

	public static void main(String[] args) {
		
		int sum=0;
	for (int i=1;i<=5;i++)
	{
		int prod=1;
		for (int j=1;j<=i;j++)
		{
			prod=prod*j;
		
		}sum=sum+prod;
		System.out.println(prod);
	}System.out.println(sum);

	}

}
