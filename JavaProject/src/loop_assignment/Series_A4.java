package loop_assignment;

public class Series_A4 {

	public static void main(String[] args) {
		int res=0;
		for (int i=1;i<=10;i++)
		{
			res= res +2;
			if(i%2==0)
			{
				System.out.print(" -"+res);
			}
			else {
				System.out.print(" "+res);
			}
		}

	}

}
