package collection;
import java.util.*;
public class EmployeeDetails {
	 private int e_id;
	 private String name;
	 private int price;
	 private String dept;
	 public EmployeeDetails()
	 {
		 
	 }
	 public EmployeeDetails(int e_id,String name,int price,String dept)
	 {
		 this.e_id=e_id;
		 this.name=name;
		 this.price=price;
		 this.dept=dept;
	 }
	 public String toString()
	 {
		 return "["+e_id+" "+name+" "+price+" "+dept+"]";
	 }
	 public void display(ArrayList<EmployeeDetails> ae)
	 {
		 for (EmployeeDetails e:ae)
		 {
			if (e.price>30000 )
			{
				System.out.println(e);
			}
		 }
	 }
	 public void show(ArrayList<EmployeeDetails> ae)
	 {
		  for (EmployeeDetails e:ae)
		  {
			  if (e.dept=="sales")
			  {
				  System.out.println();
			  }
		  }
	 }

	public static void main(String[] args) {
		ArrayList<EmployeeDetails> ae=new ArrayList();
		EmployeeDetails e=new EmployeeDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of emp.");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter emp. id");
			int id=sc.nextInt();
			System.out.println("Enter emp. name");
			String name=sc.next();
			System.out.println("Enter emp. salary");
			int price=sc.nextInt();
			System.out.println("Enter emp. department");
			String dept=sc.next();
			ae.add(new EmployeeDetails(id,name,price,dept));
		}
		e.display(ae);
		e.show(ae);
	}

}
