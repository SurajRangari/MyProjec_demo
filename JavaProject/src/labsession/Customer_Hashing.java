package labsession;
import java.util.*;

class Customer{
	int c_id;
	String name;
	String add;
	double bal;
	public Customer(int c_id, String name, String add, double bal) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.add = add;
		this.bal = bal;
	}
	public Customer(String name, String add, double bal) {
		super();
		this.name = name;
		this.add = add;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", add=" + add + ", bal=" + bal + "]";
	}
	
	
}
public class Customer_Hashing {

	public static void main(String[] args) {
		
		ArrayList<Customer> arr=new ArrayList<>();
		arr.add(new Customer(101,"Salim","Pune",24000));
		arr.add(new Customer(102,"Amar","Nanded",60000));
		arr.add(new Customer(103,"Don","Mumbai",32000));
		arr.add(new Customer(104,"Anjali","Nagpur",86000));
		
		for(Customer cs:arr)
		{
			System.out.println(cs);
		}
		System.out.println("..........................");
		HashMap<Integer, Customer> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		Iterator<Customer> itr=arr.iterator();
		while(itr.hasNext())
		{
			cs
		}
		
	}
	

}
