package array;

public class FrequencyOfNo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,10,40,20}; //initialize array
		int fr[]=new int[arr.length];   // Array will store frequency of elements
		int visit=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
			   if(arr[i]==arr[j])
			   {
				   count++;
				   fr[j]=visit;  //to avoiding counting same element again
			   }
			}
			if (fr[i]!=visit)
			{
			   fr[i]=count;
			}
		}
		System.out.println("Element   Frequency");
		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=visit)
			{
				System.out.println("  "+arr[i]+"<--------->"+fr[i]);
			}
		}
		
	}

}
