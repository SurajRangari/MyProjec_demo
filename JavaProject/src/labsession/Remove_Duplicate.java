package labsession;
import java.util.*;
public class Remove_Duplicate {

	public static void main(String[] args) {
		
		ArrayList<String> as= new ArrayList<>();
	//	as.add("red");
	//	as.add("black");
		as.add("blue");
		as.add("red");
		as.add("brown");
		as.add("black");
	//	as.add("black");
		as.add("yellow");
		as.add("green");
		System.out.println(as);
		
//		Iterator<String> itr=as.iterator();
//		while (itr.hasNext())
//		{
//			for (int i=0;i<as.size();i++)
//			{
//				
//			}
//			
//		}
//		for (int i=0;i<as.size();i++)      // for removing duplicate elements
//		{
//			for (int j=i+1;j<as.size();j++)
//			{
//				if (as.get(i)==as.get(j))
//				{
//					as.remove(j);
//				}
//			}
//			
//		}
		System.out.println("After removing duplicates from as......");
		System.out.println(as);
		System.out.println("...................................");
		
		ArrayList<String> as1=new ArrayList<>();     // removing elements of as which in as1
	//	as1.add("red");
		as1.add("white");
		as1.add("pink");
		as1.add("black");
	//	as1.add("red");
		as1.add("green");
		System.out.println(as1);
//		for (int i=0;i<as1.size();i++)
//		{
//			for (int j=i+1;j<as1.size();j++)
//			{
//				if(as1.get(i)==as1.get(j))
//				{
//					as1.remove(j);
//				}
//			}
//		}
//		as.removeAll(as1);
//		System.out.println(as);
		System.out.println("After removing duplicates from as1...........");
		System.out.println(as1);
		System.out.println("...............................");
		for (int i=0;i<as.size();i++)
		{
			for (int j=0;j<as1.size();j++)
			{
				if (as.get(i).equals(as1.get(j)))
				{
					as.remove(i);
					as1.remove(j);
					 
				}
			}
		}
		System.out.println("..............................");
		System.out.println(as);
		System.out.println(as1);
	}

}
