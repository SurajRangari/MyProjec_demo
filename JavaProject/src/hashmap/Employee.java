package hashmap;
import java.util.*;
public class Employee {
	 
	int id;
	String name;
	int salery;
	public Employee(int id, String name, int salery) {
		super();
		this.id = id;
		this.name = name;
		this.salery = salery;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalery() {
		return salery;
	}
	public void setSalery(int salery) {
		this.salery = salery;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salery=" + salery + "]";
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(id,name,salery);
		// return Objects
	}
	

}
