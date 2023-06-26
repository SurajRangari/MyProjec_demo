package treemap;

public class Employee implements Comparable<Employee>{
	
	int id,salary;
	String name,dept;
	public Employee(int id, int salary, String name, String dept) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	
	@Override
	public int compareTo(Employee o)
	{
		return this.id - o.id;
	}
	
	

}
