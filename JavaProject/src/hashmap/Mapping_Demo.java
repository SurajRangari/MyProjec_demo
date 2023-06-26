package hashmap;
import java.util.*;
public class Mapping_Demo {

	public static void main(String[] args) {
		
//		HashMap<Integer,String> hm=new HashMap<>();
//		hm.put(12, "pune");
//		hm.put(45, "nagpur");
//		System.out.println(hm.put(23, "nasik"));
//		System.out.println(hm);
//		System.out.println(hm.put(23, "mumbai"));
		
		HashMap<Integer,ArrayList<String>> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter key");
			int key=sc.nextInt();
			ArrayList<String> arr=new ArrayList<>();
			System.out.println("Enter names");
			for(int j=0;j<2;j++)
			{
				arr.add(sc.next());
			}
			hm.put(key, arr);
			
			
		}
		System.out.println(".................");
		for(Map.Entry<Integer, ArrayList<String>> m:hm.entrySet()) {
			System.out.println(m.getKey()+"      "+m.getValue());
		}

	}

}
