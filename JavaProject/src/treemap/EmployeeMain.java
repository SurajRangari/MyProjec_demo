package treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeMain implements Comparator<Employee> {
	TreeMap<Employee, String> tm=new TreeMap<>();
	
	void addData() 
	{
		tm.put(new Employee(24,56000,"Kajal","Admin"), "9556465835");
		tm.put(new Employee(36,89000,"Anmol","Dispatch"), "9559665835");
		tm.put(new Employee(99,84000,"Vijay","Quality"), "9562465865");
		tm.put(new Employee(56,76000,"Rushikesh","Production"), "959965835");
		tm.put(new Employee(86,85000,"Krutika","HR"), "9562468635");
		tm.put(new Employee(102,67000,"Babu","Finance"), "9562452835");
		tm.put(new Employee(85,58000,"Abhishek","HR"), "9562465899");
		tm.put(new Employee(66,45000,"Amay","Marketing"), "9562464535");
		tm.put(new Employee(76,55000,"Shaho","Sales"), "9562445835");
		
		Set<Map.Entry<Employee, String>> map=tm.entrySet();
		for(Map.Entry<Employee, String> m:map)
		{
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
	
		EmployeeMain m=new EmployeeMain();
		m.addData();
		
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.id-o1.id ;
	}

}
