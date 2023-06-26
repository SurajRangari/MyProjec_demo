package lab.assign;
import java.util.*;
class Student{
	int rollNo;
	String name;
	int age;
	
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Student_Comparator {

	public static void main(String[] args) {
	
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(101,"Arjun",25));
		al.add(new Student(102,"Archana",24));
		al.add(new Student(105 ,"Mayur",26));
		al.add(new Student(104,"Sahali",23));
		
		for(Student s:al)
		{
			System.out.println(s);
		}
		System.out.println("........................");
		Collections.sort(al, new MyRollNoComparator());
		for(Student s:al)
		{
			System.out.println(s);
		}
		System.out.println("........................");
		Collections.sort(al, new MyNameComparator());
		for(Student s:al)
		{
			System.out.println(s);
		}
		System.out.println("........................");
		Collections.sort(al, new MyAgeComparator());
		for(Student s:al)
		{
			System.out.println(s);
		}
	}

}
class MyRollNoComparator implements Comparator<Student> {
	public int compare(Student s1,Student s2)
	{
		return s1.rollNo - s2.rollNo;
	}
}
class MyNameComparator implements Comparator<Student> {
	
	

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}	
}
class MyAgeComparator implements Comparator<Student>
{
	public int compare(Student a1,Student a2)
	{
		return a1.age - a2.age;
	}
}
