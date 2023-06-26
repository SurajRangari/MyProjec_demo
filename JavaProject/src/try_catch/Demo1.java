package try_catch;

public class Demo1 {

	public static void main(String[] args) {
		int j= testReturn();
		System.out.println(j);
	}
	public static int testReturn() {
		int num=10;
		try
		{
			num=20;
			return num;
		}
		catch(Exception e)
		{
			num=30;
			return num;
		}
		finally
		{
			num=3;
			System.out.println("is finally"+num);
		} 
		return num;
	}

}
