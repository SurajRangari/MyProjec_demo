package custom_exception;

class InvalidBinary extends RuntimeException {
	public InvalidBinary() {
		super();
	}
	public InvalidBinary(String msg) {
		super(msg);
	}
}

public class CustException  {
	
	public static void checkBinary(int num) {
		boolean isbinary=true;
		int temp=num;
		while(num>0)
		{
			int digit=num%10;
			num=num/10;
			if (digit=='0' || digit=='1')
			{
				continue;
			}else {
				isbinary=false; 
				break;
			}
		}
		
		if (isbinary==false) {
			throw new InvalidBinary("Number not Binary");
		}else
		{
			//write logic to convert into decimal
			num=temp;
			int count=0;
			int sum=0;
			
			while (num>0) {
				int d=num%10;
				sum += d*Math.pow(2, count);
				num=num/10;
				count++;
				}
			
			System.out.println(sum);
		}
		
		System.out.println("Done...........");
	}
	
	public static void main(String[] args) {
		try {
			CustException.checkBinary(1111);
		}catch (InvalidBinary e) {
			System.out.println(e);
		}
		System.out.println("Done......");
	
		
		

	}

}
