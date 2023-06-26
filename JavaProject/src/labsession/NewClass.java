package labsession;

public class NewClass {

	int eid;
	String ename;
	int esalery;
	int eage;

	public  NewClass(int id,String name,int salery,int age) {
		eid=id;
		ename=name;
		esalery=salery;
		eage=age;

	}
	public void bonus()
	{
		if (eage>=60) {
			System.out.println(esalery+" "+ "bonus is 5000");
		} else if (eage>=45)
		{
			System.out.println(esalery+" " +"bonus is 2000");
		}else
		{
			System.out.println(esalery);
		}
	}
	public void display() {
		System.out.println(eid+" "+ename+" "+esalery+" "+eage);
	}
	public static void main(String[] args) {
		NewClass cl= new NewClass(101,"Rahul",10000,65);
		cl.display();
		cl.bonus();


	}
}	


