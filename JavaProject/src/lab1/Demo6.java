package lab1;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D("Blue");
		System.out.println(d.colour);

	}

}
class C{
	int id;
	String name;
	C(int id){
		this.id=id;
	}
}
class D extends C{
	String colour;
	String type;
	D() {
		this.colour="Red";
	}
	D(String colour)
	{
		this();
		this.colour=colour;
	}
}
