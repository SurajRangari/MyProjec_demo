package labsession;
import java.util.Scanner;
import java.util.*;
public class Supplier  {
	int s_id;
	String name;
	SItem i;
	public Supplier()
	{
		
	}
	public Supplier(int s_id,String name,SItem i)
	{
		this.s_id=s_id;
		this.name=name;
		this.i=i;
	}

	@Override
	public String toString() {
		return "Supplier [s_id=" + s_id + ", name=" + name + ", i=" + i + "]";
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
//		Supplier si=new Supplier();
//		SItem i=new SItem();
		ArrayList<Supplier> as=new ArrayList<>();
		System.out.println("Enter no. of Supplier");
		int s=sc.nextInt();
		
		for (int j=0;j<s;j++)
		{
		System.out.println("Enter supplier id");
		int id=sc.nextInt();
		System.out.println("Enter supplier name");
		String name=sc.next();
		System.out.println("Enter item id");
		int sid=sc.nextInt();
		System.out.println("Enter idem name");
		String iname=sc.next();
		System.out.println("Enter item price");
		int price=sc.nextInt();
		as.add(new Supplier(id,name,new SItem(sid,iname,price)));
		}
	//	System.out.println(as);
	//	Iterator<Supplier> itr=as.iterator();
				for (Supplier e:as)
				{
				    if(e.i.i_price>100)
				    {
				    	System.out.println(e);
				    }
				}
			
				
				
			
				
	}

}
