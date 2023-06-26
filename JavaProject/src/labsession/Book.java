package labsession;

public class Book {
	private int id;
	private int price;
	private String book_name;
	public void setBid(int id)
	{
		this.id=id;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setName(String book_name)
	{
		this.book_name=book_name;
	}
	public int getBid()
	{
		return id;
	}
	public int getPrice()
	{
		return price;
	}
	public String getName()
	{
		return book_name;
	}

	public static void main(String[] args) {
		Book b= new Book();
		b.setBid(101);
		b.setPrice(500);
		b.setName("Java");
		System.out.println(b.getBid());
		System.out.println(b.getName());
		if (b.book_name.equals("Java"))
		{
			b.price =b.price -(b.price*10/100);
			
		}
		System.out.println(b.getPrice());

	}

}
