package polymorphism;
class Pen2{
	String colour;            //using constructor
	String name;
	int price;
	Nib2 n;
	public Pen2(String colour,String name,int price,Nib2 n) {
		this.colour=colour;
		this.name=name;
		this.price=price;
		this.n=n;
	}
}
class Nib2{
	String material;
	int price;
	public Nib2(String material,int price) {
		this.material=material;
		this.price=price;
	}
	
	
}
public class Bag1 {
	String brand_name;
	int price;
	Pen2 p;
      public Bag1(String brand_name,int price,Pen2 p) {
    	  this.brand_name=brand_name;
    	  this.price=price;
    	  this.p=p;
      }
	public static void main(String[] args) {
		Bag1 b=new Bag1("Fastrack",4000,new Pen2("Black","Cello",50,new Nib2("Plastic",30)));
		System.out.println(b.brand_name);
		System.out.println(b.price);
		System.out.println(b.p.colour);
		System.out.println(b.p.name);
		System.out.println(b.p.price);
		System.out.println(b.p.n.material);
		System.out.println(b.p.n.price);
	

	}

}
