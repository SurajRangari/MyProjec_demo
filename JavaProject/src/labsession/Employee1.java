package labsession;

public class Employee1 {
	
	int id;
	String name;
	Department d;
	public Employee1(int id, String name, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", d=" + d + "]";
	}
	
	

}
