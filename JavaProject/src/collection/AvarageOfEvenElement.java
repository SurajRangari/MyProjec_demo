package collection;
import java.util.*;
public class AvarageOfEvenElement {

	public static void main(String[] args) {
	
		ArrayList<Integer> al= new ArrayList<>();
		al.add(14);
		al.add(13);
		al.add(25);
		al.add(12);
		al.add(32);
		int count=0;
		float sum=0;
		
		for (int i=0;i<al.size();i++)
		{
			if (al.get(i)%2==0)
			{
				count++;
				sum = sum + al.get(i);
			}
		}
		System.out.println(sum);
		System.out.println(count);
		float result=(float)(sum/count);
		System.out.println("Avarage of Even Elements are = "+result);

	}

}
