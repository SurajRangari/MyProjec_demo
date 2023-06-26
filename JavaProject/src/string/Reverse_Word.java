package string;
import java.util.Scanner;
public class Reverse_Word {
    
	// code to reverse each word from string except 1st and last word.
	
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String s=sc.next();
	  char ch[]=s.toCharArray();
	  for(int i=s.length()-2;i>0;i--)
	  {
		System.out.print(ch[i]);  
	  }
	  
	  

	}

}
