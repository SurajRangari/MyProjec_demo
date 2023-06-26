package theaterproject;

public class Movie {
	
	int m_id;
	String name;
	int price;
	float rating;
     int getM_id() {
		return m_id;
	}
   
	
	void setM_id(int m_id) {
		this.m_id = m_id;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 int getPrice() {
		return price;
	}
	 void setPrice(int price) {
		this.price = price;
	}
     float getRating() {
		return rating;
	}
	 void setRating(float rating) {
		this.rating = rating;
	}
	 @Override
		public String toString() {
			return "Movie [m_id=" + m_id + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	 }
}
