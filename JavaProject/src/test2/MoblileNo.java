package test2;
import java.util.Scanner;
public class MoblileNo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Mobile no.");
	 long mobileNo=sc.nextLong();
	 int count=0;
	 while(mobileNo>0)
	 {
		 long d=mobileNo%10;
		 count++;
		 mobileNo=mobileNo/10;
		 
	 }
	 if (count==10)
	 {
		 System.out.println("Mobile no accepted");
	 }else
	 {
		 System.out.println("Invalid mobile no");
	 }

	}

}
