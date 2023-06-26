package lab.assign;
import java.util.*;

public class ArrayList_Hashmap {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("mumbai");
		al.add("nasik");
		al.add("nagpur");
		al.add("pune");
		System.out.println(al);
		
		HashMap<String,Integer> hs=new HashMap<>();
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equalsIgnoreCase(al.get(j)))
				{
					count++;
					al.remove(j);
					j--;
				}
			}
			hs.put(al.get(i), count);
		}
		System.out.println(".........................");
		for(Map.Entry<String, Integer> m:hs.entrySet())
		{
		System.out.println(m);
		}

	}

}
