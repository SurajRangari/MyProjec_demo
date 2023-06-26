package lab1;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB ab=new AB();
		ab.showVar();

	}

}
class AB{
	int rollNo;
	String name;
	public static void showVar() {
	System.out.println("rollNo="+rollNo+"name="+name);	
	}
}
