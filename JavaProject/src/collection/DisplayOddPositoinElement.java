package collection;
import java.util.*;
public class DisplayOddPositoinElement {

	public static void main(String[] args) {
	   
		ArrayList<Integer> as= new ArrayList<>();
		
		as.add(101);
		as.add(102);
		as.add(103);
		as.add(104);
		as.add(105);
		as.add(106);
		System.out.println(as);
		System.out.println("...........Displaying only odd Position Element..........");
		
//		for (int i=0;i<as.size();i++)
//		{
//			if (i%2==0)
//			{
//			System.out.print(as.get(i)+" ");
//			}
//		}
		ListIterator<Integer> itr= as.listIterator();
		while (itr.hasNext())
		{
			itr.next(); //   
			System.out.println(itr.next());
			 
		}
	}

}
