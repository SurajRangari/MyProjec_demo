package hashmap;
import java.util.*;
public class IteratingHashMap {

	public static void main(String[] args) {
		HashMap<String,Float> smap= new HashMap<>();
		 smap.put("Alica", 80.5f);
		 smap.put("Allu", 50.95f);
		 smap.put("Arjun", null);
		 System.out.println(smap);
		 System.out.println("..................");
		 
		 
		 Set<String> keyset=smap.keySet();
		 for (String s:keyset)
		 {
			 System.out.println(s);
		 }
	}

}
