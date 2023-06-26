package hashmap;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Sam");
		System.out.println(map.put(2, "Vijay"));
		map.put(3, "Suraj");
		map.put(null, "NA");
		map.put(null, "Unknown");
		map.put(4, "null");
		map.put(5, "null");
		map.put(6, "Alam");
		System.out.println(map.put(6, "Jay"));   // replace previous value.
		System.out.println(map);
		
		// value access to get key
		
		System.out.println("Value:"+map.get(null));
		System.out.println(map.containsKey(6));
		System.out.println(map.containsValue("Alam"));
		System.out.println(map.putIfAbsent(4, "Noor"));
	}

}
