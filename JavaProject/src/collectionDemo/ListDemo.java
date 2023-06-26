package collectionDemo;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		 
		ArrayList<String> as= new ArrayList<>();
		System.out.println(as.size());
		System.out.println(as.isEmpty());
		as.add("mango");
		as.add("orange");
		as.add("papaya");
		as.add(0, "waterlemon");
		System.out.println(as);
		System.out.println("===================");
		as.add(2, "chiku");
		System.out.println(as);
		System.out.println("=======================");
		as.set(3, "modak");   // replace that object with new object.
		System.out.println(as);
		System.out.println("=======================");
		System.out.println(as.get(2));   // get on that position element
		System.out.println("=======================");
		as.remove(3);    // removing element from that position and shifting towards left.
		System.out.println(as);
		System.out.println("=======================");
		
		ArrayList<String> as1= new ArrayList<>();
		as1.add("red");
		as1.add("blue");
		as1.add("black");
   //  as1.addAll(as);
		as1.addAll(1,as);
		System.out.println(as1);
		
	 }
 
}
