package polymorphism;
class Order
{
int order_id;              // with using constructor.+
int cust_id;
String city;

public Order(int order_id,int cust_id,String city)
{
this.order_id=order_id;
this.cust_id=cust_id;
this.city=city;
}
}
class Mydate{
	int mm;
	int dd;
	int yy;
	
	public Mydate(int mm,int dd,int yy) {
		this.mm=mm;
		this.dd=dd;
		this.yy=yy;
	}
}
public class Shipment {
	Order or;
	Mydate md;
	public Shipment(Order or,Mydate md) {
		this.or=or;
		this.md=md;
	}
	public static void main(String args[])
	{
		Shipment s=new Shipment(new Order(101,123,"nagpur"),new Mydate(12,12,97));
		System.out.println(s.or.order_id);
		System.out.println(s.or.cust_id);
		System.out.println(s.or.city);
		System.out.println(s.md.mm);
		System.out.println(s.md.dd);
		System.out.println(s.md.yy);
	}
	




	
}
