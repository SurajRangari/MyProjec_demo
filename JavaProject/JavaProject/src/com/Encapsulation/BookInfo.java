package com.Encapsulation;
import java.util.Scanner;
public class BookInfo {
	public static void main(String[] args) {
		Book b=new Book();
		b.setId(101);
		b.setName("R. Sharma");
		b.setPrice(520);
		if (b.getName().equals("R.D. Sharma"))
		{
		int	dis=(5*520/100);
		int disPrice=b.getPrice()-dis;
		System.out.println("Book_Price = " +disPrice);
		}
		else {
			System.out.println(b.getPrice());
		}
		System.out.println(b.getId());
		System.out.println(b.getName());
		
		
	}
 
}
