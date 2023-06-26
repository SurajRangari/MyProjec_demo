package test;

public class P3 {
	public static void main(String args[]) {
		//     1
		//    222
		//   33333
		//  4444444
		
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=7;j++)
			{
				if ((i==1 && (j<=3 || j>=5)) || (i==2 && (j<=2 || j>=6)) || (i==3 && (j<=1 || j>=7)))
				{
	 
					System.out.print(" ");
				}else {
					System.out.print(i);
				}
		}System.out.println();
	}

}
}