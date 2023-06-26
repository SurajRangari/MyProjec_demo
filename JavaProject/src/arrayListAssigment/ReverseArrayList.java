package arrayListAssigment;
import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("john");
		al.add('y');
		al.add(25);
		al.add('h');
		System.out.println(al);
		ArrayList al1=new ArrayList();
		for (int i=al.size()-1;i>=0;i--)
		{
			al1.add(al.get(i));
		}
		System.out.println("...........After Reverse..........");
		System.out.println(al1);
		
	}

}
