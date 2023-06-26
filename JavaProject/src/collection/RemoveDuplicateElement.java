package collection;
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
	}

}
