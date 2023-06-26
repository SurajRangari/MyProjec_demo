package library_management;
import java.util.*;

public class LibraryManagementSystem {
	
	
	ArrayList<Book> al=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int count=0;
	
	void addBook()
	{
	System.out.println("Enter no books you want to add");
	int n=sc.nextInt();
		
	for(int i=0;i<n;i++)
	{	
	System.out.println("Enter book id");
	int id=sc.nextInt();
	System.out.println("Enter book title");
	String title=sc.next();
	System.out.println("Enter author name");
	String author=sc.next();
	System.out.println("Enter genre name");
	String genre=sc.next();
	System.out.println("Enter book year");
	int year=sc.nextInt();
	al.add(new Book(id,title,author,genre,year));
	}
	
	}
	
	void removeBook()
	{
		System.out.println("Enter the book id which you want remove");
		int id2=sc.nextInt();
		
		for(int i=0;i<al.size();i++)
		{
			if(id2==al.get(i).id)
			{
				al.remove(i);
			}
		}
		System.out.println("Removed successfully......");
	}
	
	void searchByTitle()
	{
		System.out.println("Enter book title which you want to search");
		String title2=sc.next();
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).title.equalsIgnoreCase(title2))
			{
				System.out.println(al.get(i));
			}
		}
	}
	
	void searchByAuthor()
	{
		System.out.println("Enter book author which you want to search");
		String name2=sc.next();
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).author.equalsIgnoreCase(name2))
			{
				System.out.println(al.get(i));
			}
		}
	}
	
	void displayAllBook()
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
	
	void displayBookByGenre()
	{
		System.out.println("Enter genre which you want to search");
		String genre2=sc.next();
		
		for(int i=0;i<count;i++)
		{
			if(al.get(i).genre.equalsIgnoreCase(genre2))
			{
				System.out.println(al.get(i));
			}
		}
	}
	

	public static void main(String[] args) {
		
		LibraryManagementSystem l=new LibraryManagementSystem();
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
		System.out.println("1.add");
		System.out.println("2.remove");
		System.out.println("3.searchByTitle");
		System.out.println("4.searchByAuthor");
		System.out.println("5.display");
		System.out.println("6.displayByGenre");
		
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: l.addBook();
		break;
		
		case 2: l.removeBook();
		break;
		
		case 3: l.searchByTitle();
		break;
		
		case 4: l.searchByAuthor();
		break;
		
		case 5: l.displayAllBook();
		break;
		
		case 6: l.displayBookByGenre();
		break;
		
		default:System.out.println("Exit");
		
		}
		
		System.out.println("Do you want to continue y/n");
		ch=sc.next().charAt(0);
		
		}while(ch=='y' || ch=='Y');
	


	}

}
