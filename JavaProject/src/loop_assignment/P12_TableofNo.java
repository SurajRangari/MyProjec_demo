package loop_assignment;
import java.util.Scanner;
public class P12_TableofNo {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Table of no");
          int num=sc.nextInt();
          System.out.println("============");
          for (int i=1;i<=10;i++)
          {
        	  int p=i*num;
        	  System.out.println(i+" * "+num+" = "+p);
          }
         
          


	}

}
