package string;
import java.util.Scanner;
public class String_Pattern {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String");
	    String s=sc.nextLine();
	    String s1[]=s.split(" ");
	    /*for (String s2:s1.split( ))
	    {
	    	System.out.println(s2);
	    }*/
	    for (int i=0;i<s1.length;i++)
	    {
	    	for (int j=0;j<=i;j++)
	    	{
	    		System.out.print(s1[j]+" ");
	    	}
	    	System.out.println();
	    }

	}

}
