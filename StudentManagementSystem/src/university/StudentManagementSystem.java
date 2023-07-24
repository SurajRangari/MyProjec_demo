package university;
import java.util.*;


public class StudentManagementSystem {
	
	Student s[]=new Student[15];
	ArrayList<Student> al=new ArrayList<>();
	int count=0;
    Scanner sc=new Scanner(System.in);
	
	void addStudent()
	{
	System.out.println("Enter no of Students");
	int a=sc.nextInt();
	
	for(int i=0;i<a;i++)
	{
	System.out.println("Enter student id");
	int id=sc.nextInt();
	System.out.println("Enter student name");
	String name=sc.next();
	System.out.println("Enter student course");
	String course=sc.next();
	System.out.println("Enter student grade");
	double grade=sc.nextDouble();
	s[count]=new Student(id,name,course,grade);
	count++;
	}
	}
	
	void removeStudent()
	{
		System.out.println("Enter student id which you want remove");
		int id1=sc.nextInt();
		
		for(int i=0;i<count;i++)
		{
			if(s[i].getId()==id1)
			{
				s[i]=null;
			}
		}
	}
	
	void searchByName()
	{
	    System.out.println("Enter student which you want to search");
	    String name1=sc.next();
	    
	    for(int i=0;i<count;i++)
	    {
	    	if(s[i].getName().equalsIgnoreCase(name1))
	    	{
	    		System.out.println(s[i]);
	    	}
	    }
	}
	
	void displayAllStudent()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	void displayStudentByCourse()
	{
		System.out.println("Enter the course");
		String course1=sc.next();
		
		for(int i=0;i<count;i++)
		{
			if(s[i].getCourse().equalsIgnoreCase(course1))
			{
				System.out.println(s[i]);
			}
		}
		
	}
	
	public static void main(String a[])
	{
		StudentManagementSystem s1=new StudentManagementSystem();
		char ch;
		Scanner sc=new Scanner(System.in);
		
		do
		{
		System.out.println("1.add");
		System.out.println("2.remove");
		System.out.println("3.search");
		System.out.println("4.display");
		System.out.println("5.displayByCourse");
		
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: s1.addStudent();
		break;
		
		case 2: s1.removeStudent();
		break;
		
		case 3: s1.searchByName();
		break;
		
		case 4: s1.displayAllStudent();
		break;
		
		case 5: s1.displayStudentByCourse();
		break;
		}
		
		System.out.println("Do you want to continue");
		ch=sc.next().charAt(0);
		
		}while(ch!='n' || ch!='N');
	}

}
