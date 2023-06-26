package string;

public class FreqDemo {

	public static void main(String[] args) {
		
		String sr="surajrangari";
		int[] freq=new int[sr.length()];
	//	char[]s=sr.toCharArray();
	//	System.out.println(s);
		int fr[]=new int[sr.length()];
		char visit='@'; 
		for(int i=0;i<sr.length();i++)
		{
			int count=1;
			for(int j=i+1;j<sr.length();j++)
			{
				if(sr.charAt(i)==sr.charAt(j))
				{
					count++;
					fr[j]=visit;
				}
			}
			if(fr[i]!=visit)
			{
				fr[i]=count;
			}
		}
		System.out.println("Elements    Frequency");
		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=visit  )
			{
				System.out.println("   "+sr.charAt(i)+"         "+fr[i]);
			}
		}

	}

}
