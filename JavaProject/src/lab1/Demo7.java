package lab1;

public class Demo7 {

	 
		 
	/*
	 * int num;
	 * 
	 * //craeating a default constructor Demo7(){ System.out.println("I am Suraj");
	 * }
	 */

	public static void main (String[] args) {
		Child_1 c=new Child_1();
		System.out.println("craeting another object");
		Child_1 c2=new Child_1();
		
	}

}
class P{
	static int i=10;
	int j=4;
	static {
		System.out.println("A");
	}
	{
		System.out.println("B");
	}
	P(){
		System.out.println(" in constructor of P");
	}
	static {
		System.out.println("D");
	}
}
class Child_1 extends P{
	static {
		System.out.println("E");
	}
	Child_1(){
		System.out.println("inconstructor of child ");
	}{
		System.out.println("G");
	}
}

