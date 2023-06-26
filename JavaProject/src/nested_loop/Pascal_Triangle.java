package nested_loop;

public class Pascal_Triangle {
	public static void main(String args[])
	{
		for (int i=0;i<10;i++)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print(" ");
			}
			int num=1;
			for (int j=0;j<i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

}
