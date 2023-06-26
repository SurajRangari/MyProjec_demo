package lab.assign;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int id;
	double salary;
	String country;
	
	public Employee(int id,double salary,String country)
	{
		super();
		this.id=id;
		this.salary=salary;
		this.country=country;
	}
	
	public String toString() {
		return "Employee [id="+id+" salary="+salary+" country="+country+"]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.salary>o.salary)     //sorting salary in descending order
		{
			return -1;
		}else if(this.salary<o.salary)
		{
			return 1;
		}else 
		{
			return this.country.compareTo(o.country);  //sorting name in ascending order
		}
	}
	
	
}
public class Employee_Comparable {

	public static void main(String[] args) {
		
		ArrayList<Employee> arr=new ArrayList();
		arr.add(new Employee(1,80000,"india"));
		arr.add(new Employee(2,90000,"pakistan"));
		arr.add(new Employee(3,90000,"china"));
		arr.add(new Employee(4,70000,"russia"));
		arr.add(new Employee(5,80000,"uk"));
		for(Employee e:arr)
		{
			System.out.println(e);
		}
		System.out.println("......................");
		Collections.sort(arr);
		for(Employee e:arr)
		{
			System.out.println(e);
		}

	}

}
