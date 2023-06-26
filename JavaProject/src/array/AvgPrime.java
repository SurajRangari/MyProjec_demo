package array;

public class AvgPrime {
	public static void avgPrime(int n[]) {
		int count=0;
		int sum=0;
		double res;
		for (int i=0;i<n.length;i++)
		{
			boolean isprime=true;
			int x=n[i];
			for (int j=2;j<x;j++)
			{
				if (x%j==0)
				{
					isprime=false;
					break;
				}
			}
			if (isprime)
			{
				count++;
				sum=sum+x;
			}
		}res=(double)(sum/count);
		System.out.println(count);
		System.out.println(sum);
		System.out.println("Avg. of Prime="+res);
	}

	public static void main(String[] args) {
		 int a[]= {5,13,8,9,7};
		 AvgPrime.avgPrime(a);
	}

}
