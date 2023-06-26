package collectionDemo;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vs=new Vector<>();
		vs.add("green");
		vs.addElement("black");
		vs.addElement("red");
		vs.add("blue");
		
		Iterator<String> itr=vs.iterator();
		while (itr.hasNext())
		{
			String s=itr.next();
			if (s.equalsIgnoreCase("red"))
			{
				itr.remove();
			}
		}
		System.out.println(vs);
	}

}
