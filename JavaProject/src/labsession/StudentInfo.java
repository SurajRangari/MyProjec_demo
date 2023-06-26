package labsession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
class Student{
	int key;
	String name;
	int per;
	public Student(int key, String name, int per) {
		super();
		this.key = key;
		this.name = name;
		this.per = per;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [key=" + key + ", name=" + name + ", per=" + per + "]";
	}
	
	
}
public class StudentInfo {

	public static void main(String[] args) {
	
		ArrayList<Student> arr=new ArrayList<>();
		arr.add(new Student(1,"sonal",88));
		arr.add(new Student(2,"sandeep",34));
		arr.add(new Student(3,"atul",90));
		arr.add(new Student(4,"jitesh",65));
		arr.add(new Student(5,"prasad",33));
		for(Student s:arr)
		{
			System.out.println(s);
		}
		
		HashMap<String,String> hs=new HashMap<>();
		
		
		
		Iterator<Student> itr=arr.iterator();
		while(itr.hasNext())
		{
             Student s1 = itr.next();
			//int per1=st.per;
			if(s1.per<=90 && s1.per>=35)
			{
			    String p = "pass";
				hs.put(s1.name, p);
			}
			else
			{
				String f = "fail";
				hs.put(s1.name, f);
			}
		}
		for(Map.Entry<String, String> m:hs.entrySet())
		{
		System.out.println(m);
		}
		
	}

}
