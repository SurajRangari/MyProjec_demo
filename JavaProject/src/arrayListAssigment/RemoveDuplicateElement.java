package arrayListAssigment;
import java.util.*;
public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		ArrayList<String> as= new ArrayList();
		as.add("sita");
		as.add("babalu");
		as.add("abdul");
		as.add("sapna");
		as.add("sita");
		as.add("mango");
		as.add("orange");
		as.add("sapna");
		as.add("sita");
		System.out.println(as);
	//	System.out.println(as.size());  //displaying how many elements in arraylist.
	//	System.out.println(as.contains("orange")); 
		
//		Iterator<String> itr=as.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		ArrayList<String> as1= new ArrayList();
		for (int i=0;i<as.size();i++)
		{
			if (as1.contains(as.get(i))==false)
			{
				as1.add(as.get(i));
			}
			
		}
		System.out.println(".......After removal of duplicates..........");
		System.out.println(as1);
	//	as1.removeAll(as1);       // to empty arraylist.
	//	System.out.println(as1);
		as1.add("apple");
		as1.add("chiku");
		as.removeAll(as1);
		System.out.println(as);
	}

}
