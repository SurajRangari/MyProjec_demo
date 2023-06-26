package collectionDemo;
import java.util.*;
public class ArrayListemo2 {
 
	// displaying arraylist using various ways
	
	public static void main(String[] args) {
		String city[]= {"pune","nagpur","mumbai","bhandara"};
		
		//way1
		ArrayList<String> as=new ArrayList(Arrays.asList(city));
		System.out.println(as);
		
		// way2
		ArrayList<String> as1= new ArrayList<>();
		Collections.addAll(as1,city);
		System.out.println(as1);
		
		// way3
		ArrayList<String> as2= new ArrayList();
		for
		(int i=0;i<city.length;i++)
		{
			as2.add(city[i]);
		}
		System.out.println(as2);
	}

}
