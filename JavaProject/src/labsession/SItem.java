package labsession;

public class SItem {
	int id;
	String i_name;
	int i_price;
	public SItem()
	{
		
	}
	
	public SItem(int id,String i_name,int i_price)
	{
		this.i_name=i_name;
		this.id=id;
		this.i_price=i_price;
	}

	@Override
	public String toString() {
		return "SItem [id=" + id + ", i_name=" + i_name + ", i_price=" + i_price + "]";
	}
	

}
