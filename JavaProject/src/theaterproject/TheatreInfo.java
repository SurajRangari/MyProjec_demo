package theaterproject;
import java.util.Scanner;
public class TheatreInfo { 
	   
	// for single movie in theatre

	public static void main(String[] args) {
	 Theatre t[]=new Theatre[2];
	 Scanner sc=new Scanner(System.in);
	 
	 for (int i=0;i<t.length;i++)
	 {
		 System.out.println("Enter theatre id");
		 int t_id=sc.nextInt();
		 System.out.println("Enter theater name");
		 String name1=sc.next();
		 System.out.println("Enter movie id");
		 int m_id=sc.nextInt();
		 System.out.println("Enter mivie name");
		 String name=sc.next();
		 System.out.println("Enter movie price");
		 int price=sc.nextInt();
		 System.out.println("Enter movie rating");
		 float rating=sc.nextFloat();
		 t[i]=new Theatre();
		 Movie m=new Movie();
		 t[i].setT_id(t_id);
		 t[i].setT_name(name1);
		 t[i].setM(m);
		 t[i].getM().setM_id(m_id);
		 t[i].getM().setName(name);
		 t[i].getM().setPrice(price);
		 t[i].getM().setRating(rating);
		 t[i].getT_id();
		 t[i].getT_name();
		 t[i].getM().getM_id();
		 t[i].getM().getName();
		 t[i].getM().getPrice();
		 t[i].getM().getRating();
		 
		 
	 }
	 for (int i=0;i<t.length;i++)
	 {
		// System.out.println("["+t[i].getT_id()+" "+t[i].getT_name()+" "+t[i].getM().getM_id()+" "+t[i].getM().getName()+" "+t[i].getM().getPrice()+" "+t[i].getM().getRating()+"]");
	      System.out.println(t[i]);
	 }
	}

}
