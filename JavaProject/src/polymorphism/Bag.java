package polymorphism;

public class Bag {
	private String brand_name;                //using gater seter method
	private int price;
	private Pen p;
	
  public void setBrand_Name(String brand_name) 
  {
	  this.brand_name=brand_name;
  }
  public void setPrice(int price)
  {
	  this.price=price;
  }
  public void setP(Pen p)
  {
	 this.p=p;
  }
  public String getBrand_Name()
  {
	  return brand_name;
  }
  public int getPrice()
  {
	  return price;
  }
  public Pen getP()
  {
	  return p;
  }
  public static void main(String[] args) {
		
      Bag b=new Bag();
      b.setBrand_Name("Fastrack");
      b.setPrice(3000);
      b.setP(new Pen());
      Pen p=b.getP();
      p.setColour("Black");
      p.setName("Cello");
      p.setPrice(50);
      p.setNib(new Nib());
      Nib n=p.getNib();
      n.setMaterial("Plastic");
      n.setPrice(20);
      System.out.println(b.getBrand_Name());
      System.out.println(b.getPrice());
      System.out.println(p.getColour());
      System.out.println(p.getName());
      System.out.println(p.getPrice());
      System.out.println(n.getMaterial());
      System.out.println(n.getPrice());
      
    		  
	}
  
  
  
}
  class Pen{
	  String colour;
	  String name;
	  int price;
	  Nib n;
	  
	  public void setColour(String colour)
	  {
		  this.colour=colour;
	  }
	  public void setName(String name)
	  {
		this.name=name;  
	  }
	  public void setPrice(int price)
	  {
		  this.price=price;
	  }
	  public void setNib(Nib n)
	  {
		  this.n=n;
	  }
	  public String getColour()
	  {
		  return colour;
	  }
	  public String getName()
	  {
		  return name;
	  }
	  public int getPrice()
	  {
		  return price;
	  }
	  public Nib getNib()
	  {
		  return n;
	  }
  }
  class Nib{
	  String material;
	  int price;
	  
	  public void setMaterial(String material)
	  {
		  this.material=material;
	  }
	  public void setPrice(int price)
	  {
		  this.price=price;
	  }
	  public String getMaterial()
	  {
		  return material;
	  }
	  public int getPrice()
	  {
		  return price;
	  }
	
  }
	

	


