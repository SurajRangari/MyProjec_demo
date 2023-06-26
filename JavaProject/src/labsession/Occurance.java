package labsession;

import java.util.Arrays;

public class Occurance {
	// program for occurance of char

	public static void main(String[] args) {
		
		String s="java programming";
		int count=0;
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i)=='m')
			{
				count++;
				if (count==2)
				{
					System.out.println("Position of a when occure at 2nd time "+i);
					break;
				}
			}
			
		}
		
	}

}
