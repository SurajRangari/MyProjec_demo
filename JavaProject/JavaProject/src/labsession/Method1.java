package labsession;
import java.util.Scanner;
public class Method1 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		do
		{
			System.out.println("Pizza price");
			int n1=sc.nextInt();
			System.out.println("Puff price");
			int n2=sc.nextInt();
			System.out.println("Cold Drink price");
			int n3= sc.nextInt();
			System.out.println("Enter no. of pizzas bought");
			int n4=sc.nextInt();
			System.out.println("Enter no. of puffs bought");
			int n5= sc.nextInt();
			System.out.println("Enter no.of cold drink bought");
			int n6=sc.nextInt();
			System.out.println("===============================");
			System.out.println("Bill Details");
			int bill=sc.nextInt();
			bill= (n1*n4) + (n2*n5) + (n3*n6);
			System.out.println("Total bill:"+bill);
			
		}while (ch=='y' || ch=='Y');
	}
	

}
