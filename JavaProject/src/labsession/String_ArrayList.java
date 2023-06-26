package labsession;
import java.util.*;
public class String_ArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> as= new ArrayList();
        as.add("sun");
        as.add("mon");
        as.add("sun");
        as.add("thu");
        as.add("wed");
        as.add("mon");
        ArrayList<String> as1=new ArrayList();
        
        for (int i=0;i<as.size();i++)
        {
        	int count=0;
        	for (int j=i+1;j<as.size();j++)
        	{
        		if (as.get(i).equals(as.get(j)))
        		{
        			count++;
        		}
        	}
        	if(count==0)
        	{
        		as1.add(as.get(i));
        	}
        	
        }
        System.out.println(as1);

	}

}
