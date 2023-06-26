package collection;
import java.util.*;
public class DisplayOddElement {

	public static void main(String[] args) {
	
		ArrayList<Integer> al= new ArrayList<>();
		al.add(6);
		al.add(5);
		al.add(9);
		al.add(3);
		al.add(8);
		al.add(13);
		System.out.print("Odd Elements from ArrayList are  ");
		for (int i=0;i<al.size();i++)
		{
			if (al.get(i)%2!=0)
			{
				System.out.print(al.get(i)+" ");
			}
		}

	}

}
