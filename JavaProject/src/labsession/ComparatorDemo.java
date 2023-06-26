package labsession;
import java.util.*;
class Employee implements Comparable<Employee1>
{
	int id;
	String name;
	int salary;
	
	public Employee(int id,String name,int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Employee1 o)
	{
		if (this.salary>o.salary)   // sorting for integer.
		{
			return -1;
		}else if (this.salary<o.salary)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Employee1> al=new ArrayList<>();
		al.add(new Employee1(1,"pooja",1000));
		al.add(new Employee1(2,"ram",2000));
		al.add(new Employee1(3,"sonali",3000));
		
		for (Employee1 e:al)
		{
			System.out.println(e);
		}
		System.out.println("........................");
		Collections.sort(al);
		for (Employee1 e:al)
		{
			System.out.println(e);
		}
	}

}
