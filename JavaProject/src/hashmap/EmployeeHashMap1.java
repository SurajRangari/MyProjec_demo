package hashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap1 {

	public static void main(String[] args) {
	
		HashMap<Integer,Employee> hs=new HashMap<>();
		hs.put(501, new Employee(101,"pooja",56000));
		hs.put(502, new Employee(102,"shital",60000));
		hs.put(503, new Employee(103,"shital",60000));
		hs.put(504, new Employee(104,"shital",60000));
		hs.put(505, new Employee(105,"shital",60000));
		
		for(Map.Entry<Integer,Employee> en:hs.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		System.out.println("...........................");
		
		
	}

}
