package labsession;
import java.util.*;
public class Items {
	
	private int id;
	private String name;
	private float price;
	
	public Items(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		ArrayList as=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of items");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter item id");
			int id=sc.nextInt();
			System.out.println("Enter string name");
			String name=sc.next();
			System.out.println("Enter item price");
			float price=sc.nextFloat();
			as.add(name)
		}
	
		
	}

}
