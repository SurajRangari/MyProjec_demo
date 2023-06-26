package collection;
import java.util.*;
class Train implements Comparable<Train> {
	int id;
	String name;
	int seats;
	
	public Train(int id,String name,int seats)
	{
		super();
		this.id=id;
		this.name=name;
		this.seats=seats;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", seats=" + seats + "]";
	}
	
	public int compareTo(Train o) {
		return this.seats-(o.seats);
	}
}


public class Train_Comparable {

	public static void main(String[] args) {
		
	}

}
