package lab.assign;
import java.util.Scanner;
public class StudentMarks {
	private int roll;
	private String name;
	private int age;
	private int marks;

	public int getRoll() {
		return roll;
	}
    public void setRoll(int roll) {
		this.roll = roll;
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getAge() {
		return age;
	}
    public void setAge(int age) {
		this.age = age;
	}
    public int getMarks() {
    	return marks;
    }
    public void setMarks(int marks) {
    	this.marks=marks;
    }
	@Override
	public String toString() {
		return "StudentDetails [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StudentMarks s[]=new StudentMarks[5];
	
	for (int i=0;i<s.length;i++)
	{
		System.out.println("Enter roll no.");
		int roll=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		s[i]=new StudentMarks();
		s[i].setRoll(roll);
		s[i].setName(name);
		s[i].setAge(age);
		s[i].setMarks(marks);
		s[i].getRoll();
		s[i].getName();
      	s[i].getAge();
		s[i].getMarks();
		
	}	
	
	
	for (int i=0;i<s.length;i++)
	{
	    if (s[i].marks>60 && s[i].age<15)
	    {
		 //  System.out.println("["+s[i].getRoll()+" "+s[i].getName()+" "+s[i].getAge()+" "+s[i].getMarks()+"]");
             System.out.println(s[i]);	    
	    }
	}
	}
	

}
