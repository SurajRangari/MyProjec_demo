package string;
import java.util.Arrays;
import java.util.Scanner;
public class Find_Vowels {


	//find out the no of vowels from string
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.next();
		String st=s.toLowerCase();   //converting all string to lower case
		char ch[]=st.toCharArray();  //converting string to array
		System.out.println(Arrays.toString(ch));   //displaying array from string
		for (int i=0;i<ch.length;i++)
		{
			if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' )
			{
				System.out.println(ch[i]);
			}
		}

	}

}
