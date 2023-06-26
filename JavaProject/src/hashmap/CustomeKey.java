package hashmap;
import java.util.HashMap;
import java.util.Map;
class Student{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student s= (Student) o;
		if(this.id==s.id && this.name.equals(s.name))
		{
			return true;
		}else {
			return false;
		}
	}
}
public class CustomeKey {
	
	public static void main(String a[])
	{
		HashMap<Student, Integer> hm=new HashMap<>();
		hm.put(new Student(1,"Sonal",88), 95);
		hm.put(new Student(2,"Komal",88), 98);
		hm.put(new Student(1,"Anmol",88), 93);
		
		for(Map.Entry<Student, Integer> m:hm.entrySet()) {
			System.out.println(m);
		}
	}

}
