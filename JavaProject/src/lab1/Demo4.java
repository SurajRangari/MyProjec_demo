package lab1;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Base d=new Derived();
         d.setNum(10);
         d.display();
	}

}
class Base{
	int num;
	public void display() {
		System.out.println(num);
	}
	public void setNum(int num) {
		this.num=num;
	}
}
class Derived extends Base{
	int num;
	public void display() {
		System.out.println(num);
	}
}
