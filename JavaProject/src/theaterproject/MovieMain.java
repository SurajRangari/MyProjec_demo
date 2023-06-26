package theaterproject;
import java.util.Scanner;
public class MovieMain{

	public static void main(String[] args) {
	     Movie m[]= new Movie[3];  // create an object
	     Scanner sc=new Scanner(System.in);
         
	     for (int i=0;i<m.length;i++)
	     {
	    	 System.out.println("Enter movie id");
	    	 int m_id=sc.nextInt();
	    	 System.out.println("Enter movie name");
	    	 String name=sc.next();
	    	 System.out.println("Enter movie price");
	    	 int price=sc.nextInt();
	    	 System.out.println("Enter movie rating");
	    	 float rating=sc.nextFloat();
	    	 m[i]=new Movie();
	    	 m[i].setM_id(m_id);
	    	 m[i].setName(name);
	    	 m[i].setPrice(price);
	    	 m[i].setRating(rating);
	    	 
	     }
	     for (int i=0;i<m.length;i++)
	     {
	    	 for (int j=i+1;j<m.length;j++)
	    	 {
	    		 if (m[i].rating<m[j].rating)
	    		 {
	    			 Movie temp=m[i]; 
	    			 m[i]=m[j];
	    			 m[j]=temp;
	    		 }
	    	 }
	     }
	     for (int i=0;i<m.length;i++)
	     {
	    	 System.out.println("["+m[i].m_id+" "+m[i].name+" "+m[i].price+" "+m[i].rating+"]");
	     }
	     
	}

}
