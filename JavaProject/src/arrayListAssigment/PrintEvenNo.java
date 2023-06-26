package arrayListAssigment;
import java.util.*;
public class PrintEvenNo {

	public static void main(String[] args) {
		ArrayList<Integer> ai=new ArrayList();
		for (int i=1;i<=50;i++)
		{
			ai.add(i);
		}
		//System.out.println(ai);
		Iterator<Integer> itr=ai.iterator();
		while(itr.hasNext())
		{
			itr.next();
			System.out.println(itr.next());
		}
	}

}
