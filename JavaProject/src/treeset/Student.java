package treeset;

public class Student {
	
	int id,marks;
	String name;
	
	public Student(int id,int marks,String name)
	{
		super();
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "Student [id="+id+" marks="+marks+" name="+name+"]"; 
	}

}
