package lab1;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw=new Car();
		Car wagor=new Car();

	}

}
class Car{
	static int wheels;
	static {
		m1();	}
	{
		System.out.println(++wheels);
	}
	Car(){
		System.out.println(wheels);
	}
	static void m1() {
		System.out.println(colour);
	}
	static String colour="Red";
	static {
		m1();
	}
}

