package string;
import java.util.Scanner;
public class Find_word {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=sc.nextLine();
	System.out.println("Enter word to find");
	String s2=sc.next();
	boolean b=s1.contains(s2);
	if(b)
	{
		System.out.println("Word found from string "+b);
	}
	else {
		System.out.println("Word not found from string");
	}

	}

}
