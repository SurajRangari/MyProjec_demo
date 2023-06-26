package labsession;
import java.util.*;

public class ListOfEmployee {

	public static void main(String[] args) {
		
		Department d1=new Department(1,"IT");
		Department d2=new Department(2,"HR");
		Department d3=new Department(3,"Finance");
		Department d4=new Department(1,"Production");
		
		Employee1 e1=new Employee1(1,"Sonali",d1);
		Employee1 e2=new Employee1(2,"Mohini",d3);
		Employee1 e3=new Employee1(3,"Manoj",d2);
		Employee1 e4=new Employee1(4,"Sohal",d1);
		Employee1 e5=new Employee1(5,"Salim",d4);
		Employee1 e6=new Employee1(6,"Atif",d2);
		Employee1 e7=new Employee1(7,"Maddy",d4);
		Employee1 e8=new Employee1(8,"God",d2);
		Employee1 e9=new Employee1(9,"Evil",d1);
		Employee1 e10=new Employee1(10,"End",d3);
		
		ArrayList<Employee1> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		al.add(e8);
		al.add(e9);
		al.add(e10);
		System.out.println(al);
		
		HashMap<String, ArrayList<String>> hs=new HashMap<String, ArrayList<String>>();
		Iterator<Employee1> itr=al.iterator();
		
		while(itr.hasNext())
		{
			Employee1 e=itr.next();
			String d_name= e.d.name;
			String e_name= e.name;
			
			if(hs.containsKey(d_name))
			{
				ArrayList<String> al1= hs.get(d_name);
				al1.add(e_name);
				hs.put(d_name, al1);
			}
			else 
			{
				ArrayList<String> al1=new ArrayList();
				al1.add(e_name);
				hs.put(d_name, al1);
			}
			
			
		}
		System.out.println("....................");
		
		System.out.println(hs);
	}

}
