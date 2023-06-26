package collectionDemo;
import java.util.*;
class Employee
{
	int id;
	String name;
	int price;

public Employee(int id,String name,int price)
{
	super();
	this.id=id;
	this.name=name;
	this.price=price;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
public class List_Comparable {
	
	public static void main(String[] args) {
	
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(100,"amar",50000));
		al.add(new Employee(200,"alica",60000));
		al.add(new Employee(300,"amit",56000));
		
		for (Employee e:al)
		{
			System.out.println(e);
		}
		System.out.println(".....................");
		Collections.sort(al, new MySalComparator());
		for (Employee e:al) 
		{
			System.out.println(e);
		}
	}
}
class MyIdComparator implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2)
	{
		return e1.id - e2.id;
	}
}
class MySalComparator implements Comparator<Employee> {
	public int compare(Employee o1,Employee o2)
	{
		return o1.price - o2.price;
	}
}