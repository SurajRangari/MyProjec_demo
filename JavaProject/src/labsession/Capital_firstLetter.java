package labsession;

import java.util.Arrays;

public class Capital_firstLetter {

	public static void main(String[] args) {
		String str="india is beautiful country";
		String []s=str.split(" ");
		System.out.println(Arrays.toString(s));
		System.out.print("[");
		for (int i=0;i<s.length;i++)
		{
			String s1=s[i];
			char ch[]=s1.toCharArray();
			//System.out.print(ch);
			for (int j=0;j<ch.length;j++)
			{
				if (j==0)
				{
				   ch[j]=(char)(ch[j]-32);
				   System.out.print(ch[j]);
				}
				else
				{
					System.out.print(ch[j]);
				}
			}
			System.out.print(" ");
			
		}
		System.out.print("]");

	}

}
