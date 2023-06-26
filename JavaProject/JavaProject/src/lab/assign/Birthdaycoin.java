package lab.assign;
import java.util.Scanner;
public class Birthdaycoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");  // default value is 10 for given prog.
		int num=sc.nextInt();
		if (num<0)
		{
			System.out.println("Invalid age");
		}else
		{
		int coin=num*num*num;
		System.out.println("Meenu gets "+coin+" coins");

	}
	}
}
