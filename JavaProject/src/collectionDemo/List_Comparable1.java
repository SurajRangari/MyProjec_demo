package collectionDemo;
import java.util.*;
class Car implements Comparable<Car> {
	int model;
	String cname;
	int price;
	
	public Car(int model,String cname,int price)
	{
		super();
		this.model=model;
		this.cname=cname;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", cname=" + cname + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Car o) {
	    if (this.cname.equalsIgnoreCase(o.cname))
	    {
	   // 	return this.price - o.price;   // will start with low price.
	        return o.price - this.price;
	    }
	    else
	    {
	    	return this.cname.compareTo(o.cname);
	    }
	
	}
	
}
public class List_Comparable1 {

	public static void main(String[] args) {
		LinkedList<Car> al=new LinkedList();
		al.add(new Car(1032,"BMW",780000));
		al.add(new Car(2311,"Santro",560000));
		al.add(new Car(111,"BMW",890000));
		al.add(new Car(8924,"Audi",900000));
		
		for (Car c:al) {
			System.out.println(c);
		}
		System.out.println("...................");
		Collections.sort(al);
		
		for (Car c:al)
		{
			System.out.println(c);
		}
		}

}
