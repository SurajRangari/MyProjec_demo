package lab1;
import java.util.Scanner;
public class MovieMain {
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter name");
	 String mname= sc.next();
	 System.out.println("Choose movie:\n1.DSP\2.Dhruva\n3.Raone");
	 int mchoice=sc.nextInt();
	 System.out.println("Do you have coupon?\nIf yes enter coupon code\nIf no enter 0");
	 int mcoupon=sc.nextInt();
	 sc.close();
	 
	 switch(mchoice)
	 {
	 case 1: Movie mv= new Movie(101,"DSP",100);
	      System.out.println("Hello "+mname+" !"+"\nYour ticket has been booked"+"\nPrice Rs "+mv.getPrice(mcoupon)+"\nEnjoy your show");
	      break;
	 case 2: Movie mv1=new Movie(102,"Dhruva",130);
	      System.out.println("Hello "+mname+" !"+"\nYour ticket has been booked"+"\nPrice Rs "+mv1.getPrice(mcoupon)+"\nEnjoy your show");
		 break;
	 case 3: Movie mv2=new Movie(103,"Raone",200);
	      System.out.println("Hello "+mname+" !"+"\nYour ticket has been booked"+"\nPrice Rs "+mv2.getPrice(mcoupon)+"\nEnjoy your show");
		break;
	 }
	 

}
}
