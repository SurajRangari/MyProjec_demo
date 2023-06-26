package collectionDemo;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		
		// non generic
		// used for any data type or which accept any type of data.
		ArrayList list=new ArrayList();
		list.add("nagpur");
		list.add(101);
		list.add("mumbai");
		list.add(102);
		list.add('a');
		list.add('z');
		System.out.println(list);
		System.out.println("===================");
		
		// generic
		// used for only type of data type or accept only single type of data.
		ArrayList<String> as= new ArrayList<>();
		as.add("pune");
		as.add("bhandara");
		as.add("lahor");
		as.add("masuri");
		as.add("temp");
		as.add(null);
//		try {
//		as.add(7 "pune");
//		}
//		catch(Exception e)
//		{
//			System.out.println("done");
//		}
		System.out.println(as);
		System.out.println("======================");
		for (int i=0;i<as.size();i++)
		{
			System.out.println(as.get(i));
		}
		System.out.println("===================================");
		for(String s:as)
		{
			System.out.println(s);
		}
		System.out.println("=======================================");
		
////		   Iterator is an method
////		   It is used get array in forward direction.
//		Iterator<String> itr= as.iterator();
////		    System.out.println(itr); it is showing hashcode of s1.
//		while(itr.hasNext())  //it starts before first index so after has next implement it check next object which is at initial or starting position.
//		{
//		   System.out.println(itr.next());	//it print the next value.
//		}
//		System.out.println("=====================================================");
//		
//		ListIterator is an interface
//		It is used to get array in both direction i.e, forward and backward(reverse) direction.
//		In this we can start from any position.
        
		ListIterator<String> itr= as.listIterator();
//		ListIterator<String> itr= as.listIterator(as.size());  // we can use both way 
		while(itr.hasNext())     // in this method it reached to index one greater than last one
		{
			itr.next();
		}
		while(itr.hasPrevious())   //checking it has previous object or not if yes it will continue. 
		{
			System.out.println(itr.previous());      // it will print previous value.
		}

	}

}
