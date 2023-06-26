package collectionDemo;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
	    
		ArrayList<String> as= new ArrayList<>();
		as.add("red");
		as.add("green");
		as.add("pink");
		as.add("black");
		System.out.println(as);
		System.out.println("........................");
		
		ArrayList<String> as1= new ArrayList<>();
		as1.add("blue");
		as1.add("green");
		as1.add("pink");
		// as.removeAll(as1);    // remove elements which are in common with as and as1
		as.retainAll(as1);      // show only those which are in common with as and as1
	    System.out.println(as);
	    System.out.println("........................");
	    
	}

}
