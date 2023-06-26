package collection;
import java.util.*;
public class FindPrimeNo {

	public static void main(String[] args) {
		
		ArrayList<Integer> as= new ArrayList<>();
		as.add(5);
		as.add(4);
		as.add(8);
		as.add(13);
		as.add(17);
		as.add(16);
		as.add(23);
		System.out.println(as);
		System.out.println("........Showing Prime No From Above ArrayList.............");
		
		// loop for displaying prime no
		
		for (int i=0;i<as.size();i++)
		{
			for (int j=2;j<as.get(i);j++)
			{
				if (as.get(i)%j==0)
				{
					as.remove(i);
				}
			}
		}
		System.out.println(as);
	}

}
