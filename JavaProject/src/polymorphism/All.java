package polymorphism;

public class All {

	int id;
	int order_id;
	String name;
	final int x;
	{
		x=26;
	}
	static {
		System.out.println("x is final keyword");
	}
	public All(int id,int order_id,String name)  //constructor
	{
		this.id=id;
		this.order_id=order_id;
		this.name=name;
	}
	public static void Emp() {
		System.out.println("Hi I am Emp. of TQ");
	}
	
	
	public static void main(String[] args) {
		All a=new All(101,257,"Shubham");
		System.out.println(a.id);
		System.out.println(a.order_id);
		System.out.println(a.name);
		System.out.println(a.x);
		a.Emp();
		

	}

}
