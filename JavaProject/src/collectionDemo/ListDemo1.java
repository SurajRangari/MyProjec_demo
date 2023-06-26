package collectionDemo;
import java.util.*;
public class ListDemo1 {

	public static void main(String[] args) {
	   
		ArrayList<String> as=new ArrayList();
		as.add("nagpur");
		as.add("mumbai");
		as.add("pune");
		as.add("chennai");
		as.add("simla");
		as.add("kolkata");
		as.add("agartala");
		System.out.println(as);
		
		Iterator<String> itr=as.iterator();
		while (itr.hasNext())
		{
			String s=itr.next();
			if (s.equalsIgnoreCase("simla"))
			{
			//	as.remove(s);  //fail.fast               //Exception in thread "main" java.util.ConcurrentModificationException
			//	as.add(s);                     // Reason we already all elements into itr so we can't any modification like delect or add.
			itr.remove();    //fail.safe
			}
		}
		System.out.println(as);
	}

}
