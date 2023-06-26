package collectionDemo;
import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo1 {
	
	// converting arraylist to array

	public static void main(String[] args) {
		
		ArrayList<Character> ac= new ArrayList<>();
		ac.add('a');
		ac.add('n');
		ac.add('p');
		ac.add('u');
		System.out.println(ac);
		System.out.println(".................................");
		
		Object a[]= ac.toArray();
		
		//way1
		Character ch[]= ac.toArray(new Character[ac.size()]);
		
		for (int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(".................................");
		
		// way2
		Character c[]= new Character[ac.size()];
		
		for (int i=0;i<ac.size();i++)
		{
			c[i]=ac.get(i);
		}
		for (Character cc:c)
		{
			System.out.println(cc);
		}
	}

}
