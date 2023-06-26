package method;

public class Shopping {
//	public static void main(String args[]) {
		
	//}
	int eid;
	String ename;
	int eprice;
	int quantity;
	int bill;
	public void accept_details(int id, String name,int price,int qyt)
	{
		eid=id;
		ename=name;
		eprice=price;
		quantity=qyt;
		
	}
	public void calculateBill()
	{
		if (quantity>0) {
			bill= quantity*eprice;
			display();
		}else
		{
			System.out.println("Error");
		}
	}
	public void display()
	{
	System.out.println(eid+" "+ename+" "+eprice+" "+quantity+" "+bill);
	}
	
	public static void main(String[] args)
	{
		Shopping sh=new Shopping();
		sh.accept_details(123, "suraj", 1200, 0);
		sh.calculateBill();
		//sh.display();
		
	}
	

}
