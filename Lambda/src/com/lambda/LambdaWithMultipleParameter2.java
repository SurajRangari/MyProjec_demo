package com.lambda;

interface Subtraction
{
	int sub(int n1,int n2);
}

public class LambdaWithMultipleParameter2 {

	public static void main(String[] args) {
		
		Subtraction a1=(n1,n2)->{
			System.out.println("First no :"+n1);
			System.out.println("Second no :"+n2);
			//System.out.println("The result is :"+(n1-n2));
			return((n1-n2));
		};
		System.out.println("The result is :"+a1.sub(43, 21));
		
		System.out.println(".......................");
		
		Subtraction a2=(int n1,int n2)->(n1-n2);
		
		System.out.println("The result is :"+a2.sub(57, 32));		

	}

}
