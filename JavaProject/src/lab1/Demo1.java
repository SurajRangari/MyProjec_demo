package lab1;

public class Demo1 {
	public static void main(String a[]) {
		Book b1= new Book();
		b1.price=500;
		Book b2;
		foo(b1);
		b2=b1;
		System.out.println(b2.price);
	}
	public static void foo(Book b1) {
		b1.price=150;
		b1=null;
	}

}
class Book{
	String name;
	int price=250;
}
