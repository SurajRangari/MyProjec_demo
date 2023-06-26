package com.Encapsulation;

public class StaticDemo1 {
	int x=10;
	static int a=0;
	
	public void show()
	{
		System.out.println(x+" "+a);
	}
	public static void display()
	{
		StaticDemo1 s=new StaticDemo1();
		System.out.println(s.x+" "+a);
	}
	public static void main(String args[])
	{
		StaticDemo1 d=new StaticDemo1();
		d.show();
		StaticDemo1.display();
		System.out.println(StaticDemo1.a);
	}

}
