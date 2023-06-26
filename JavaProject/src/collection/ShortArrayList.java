package collection;
import java.util.*;
public class ShortArrayList {

	public static void main(String[] args) {
	   ArrayList<Integer> al= new ArrayList<>();
	   al.add(3);
	   al.add(7);
	   al.add(1);
	   al.add(5);
	   al.add(4);
	   System.out.println(al);
	   for (int i=0;i<al.size();i++)
	   {
		   for (int j=i+1;j<al.size();j++)
		   {    
			   int t1= al.get(i);
			   int t2= al.get(j);

			   
			   if (t1 > t2)
			   {
				  al.set(i, t2);
				  al.set(j, t1);
				   
			   }

		   }
		   
		   
	   }
	   
	   System.out.println(al);
	}

}
