package labsession;

public class StarMethod {
	public static void main(String args[]) {
	
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		 
		for (int i=1;i<=9;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if (((i==1 || i==9) && j>=2) || ((i==2 || i==8) && j>=3) || ((i==3 || i==7) && j>=4) || ((i==4 || i==6) && j>=5))
				{
					System.out.print(" ");
				}else
				{	
					System.out.print("*");
			}
			}System.out.println();
		}
	

}
}