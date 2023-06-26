package java_project;
import java.util.Scanner;
public class Book {
	int book_id;
	String book_name;
	int price;
	String author_name;
	Book[] book;
	Scanner sc;
	
	public Book() {
		sc=new Scanner(System.in);
	}
	
	public Book(int book_id,String book_name,int price,String author_name) {
		this.book_id=book_id;
		this.book_name=book_name;
		this.price=price;
		this.author_name=author_name;
	}
	@Override
	public String toString() {
		return "[book_id="+book_id+",book_name="+book_name+",price="+price+",author_name="+author_name+"]";
	}
	public void insertBook(Book []book)
	{
		this.book=book;
	}
	public void showBook()
	{
		for (int i=0;i<book.length;i++)
		{
			if (book[i]!=null)
			{
				System.out.println(book[i]);
			}
		}
	}
	public void findbyBookId(int id)
	{
		for(int i=0;i<book.length;i++)
		{
			if (book[i]!=null)
			{
				if(book[i].book_id==id)
				{
					System.out.println(book[i]);
				}
			}
		}
	}
	public void updateBookPrice(int id)
	{
		boolean isUpdate=false;
		for (int i=0;i<book.length;i++)
		{
			if (book[i]!=null)
			{
				if (book[i].book_id==id)
				{
					System.out.println("Enter new price");
					int newprice=sc.nextInt();
					book[i].price=newprice;
					isUpdate=true;
				}
			}
			
		}
		if (isUpdate==true)
		{
			System.out.println("Upadate successfully..................");
		}else {
			System.out.println("Something went wrong............");
		}
		
	}
	public void delectBook(int id)
	{
		// id = sc.nextInt();
		 for (int i=0;i<book.length;i++)
		 {
		       if (id==book[i].book_id)
		         {
			          book[i]=null;
		         }
		      // System.out.println(book[i]);
		 }
	
		 
		
	}
	

	
}
