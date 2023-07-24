package com.lambda;
import java.util.*;
public class LambdaCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(23);
		al.add(12);
		al.add(13);
		al.add(4);
		al.add(24);
		al.add(32);
		
		for(int n: al)
		{
			System.out.println(n*n);
		}
		System.out.println(".............................");
		System.out.println("Square of each element");
		
		al.forEach((n)->System.out.println(n*n));
		System.out.println("...........................");
		System.out.println("Cube of each element");
		al.forEach((x)->System.out.println(x*x*x));
		
		
		ArrayList<String> sl=new ArrayList<>();
		sl.add("Suraj");
		sl.add("Prajwal");
		sl.add("Akshat");
		sl.add("Aashish");
		System.out.println(".........................");
		sl.forEach((s)->System.out.println(s+" is of length:"+s.length()));
		System.out.println(".......................");
		sl.forEach((s)->System.out.println(s.toUpperCase()));
		
	}

}
