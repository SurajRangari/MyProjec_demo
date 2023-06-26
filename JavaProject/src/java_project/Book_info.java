package java_project;
import java.util.Scanner;
public class Book_info {

	public static void main(String[] args) {
	    Book book[]=new Book[3];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter book Details");
	    for (int i=0;i<book.length;i++)
	    {
	    	System.out.println("Enter book id");
	    	int ebid=sc.nextInt();
	    	System.out.println("Enter book name");
	    	String ebname=sc.next();
	    	System.out.println("Enter book price");
	    	int ebprice=sc.nextInt();
	    	System.out.println("Enter book author");
	    	String ebauthor_name=sc.next();
	    	book[i]=new Book(ebid,ebname,ebprice,ebauthor_name);
	    }
	    Book mybook=new Book();
	    mybook.insertBook(book);
	    System.out.println("=============Show book details=============");
	    mybook.showBook();
	    System.out.println("=============Find book by id===========");
	    mybook.findbyBookId(2);
	    System.out.println("============After updating price========");
	    mybook.updateBookPrice(3);
	    mybook.showBook();
	    System.out.println("=============After removal===============");
	    mybook.delectBook(2);
	    mybook.showBook();
	    
	    

	}

}
