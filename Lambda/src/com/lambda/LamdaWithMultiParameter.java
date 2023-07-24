package com.lambda;

interface Addition
{
	void add(int n1,int n2);
	
}
public class LamdaWithMultiParameter {

	public static void main(String[] args) {
		
		Addition a1=(n1,n2)->{
			System.out.println("First no :"+n1);
			System.out.println("Second no :"+n2);
			System.out.println("The result is :"+(n1+n2));
		};
		a1.add(24, 56);
		System.out.println("..........................");
		
		//body can be omitted
		Addition a2=(int n1,int n2)->System.out.println("The result is :"+(n1+n2));
		a2.add(56, 67);
		
	}

}
