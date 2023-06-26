package nested_loop;

public class Hill_pattern {
	public static void main(String a[]) {
		//                *
		//               * *
		//              * * *
		//             * * * *
		//            * * * * * 
		//           * * * * * *
	//int space=10;
	for (int i=1;i<=10;i++)
	{
		//for(int j=1;j<=space;j++) // we can use both for loop 
		for (int j=10;j>=i;j--)      // here we do not need take any external int(space)
		{
			System.out.print(" ");
		}
		for (int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
		//space--;
	}
	}
}
