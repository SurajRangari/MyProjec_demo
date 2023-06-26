package lab.assign;
import java.util.HashMap;
import java.util.Map;
public class Copy_Mapping {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs=new HashMap();
		hs.put(101, "red");
		hs.put(102, "blue");
		hs.put(103, "brown");
		hs.put(104, "black");
		
		System.out.println(hs);
		
//		for(Map.Entry<Integer, String> m:hs.entrySet())
//		{
//			System.out.println(m);
//		}
		
		HashMap<Integer, String> hs1=new HashMap();
		for(Map.Entry<Integer, String> m:hs.entrySet())  //for copying data from one map to another map.
		{
			hs1.put(m.getKey(), m.getValue());
		}
		System.out.println("........................");
		System.out.println(hs1);

	}

}
