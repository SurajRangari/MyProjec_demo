package library_management;

public class Book {
	
	int id,year,quantity;
	String title,author,genre;
	public Book(int id, int year, int quantity, String title, String author, String genre) {
		super();
		this.id = id;
		this.year = year;
		this.quantity = quantity;
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", year=" + year + ", quantity=" + quantity + ", title=" + title + ", author="
				+ author + ", genre=" + genre + "]";
	}
	
	

}
