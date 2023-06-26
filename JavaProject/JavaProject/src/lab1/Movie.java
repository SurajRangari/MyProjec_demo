package lab1;

public class Movie {
   
	int eid;
	String ename;
	double eprice;
	int coupon;
	 
	public Movie(int id,String name,double price) {
		
		eid=id;
		ename=name;
		eprice=price;
	}
	public double getPrice(double coupon) {
		if (coupon==100)
		{
			System.out.println("Discount is 15%\nTotal price="+(eprice-0.15*eprice));
		}else if (coupon==200)
		{
			System.out.println("Discount is 10%\nTotal price="+(eprice-0.10*eprice));
		}else
		{
			System.out.println("Total price"+eprice);
		}
	    return eprice;
	}

}
