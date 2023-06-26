package lab.assign;
import lab1.Demo7;
public class B extends Demo7 {
	public int foo() {
		int i=10;
		return(this.num + i);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		System.out.println(b.foo());

	}   

}
