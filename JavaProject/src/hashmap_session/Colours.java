package hashmap_session;
import java.util.*;
public class Colours {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList();
		arr.add("red");
		arr.add("blue");
		arr.add("red");
		arr.add("black");
		arr.add("black");
		arr.add("red");
		arr.add("blue");
		arr.add("pink");
		System.out.println(arr);
		System.out.println("........................");
		
		HashMap<String, Integer> hm=new HashMap();
		for(int i=0;i<arr.size();i++)
		{
			int count=1;
			for(int j=i+1;j<arr.size();j++)
			{
				if(arr.get(i).equalsIgnoreCase(arr.get(j)))
				{
					count++;
					arr.remove(j);
					j--;
					
					
				}
				//if(count>=1)
				
			}
			
				hm.put(arr.get(i), count);
			
		}
		System.out.println(hm);

	}

}
