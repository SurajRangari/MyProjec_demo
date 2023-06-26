package test5;

public class P1 {
	int i=10;
	void m1(P1 o) {
		this.i = o.i + i;
		System.out.println("i="+i);
	}
	void m2() {
		m1(this);
	}
    public static void main(String a[])
    {
    	P1 oo=new P1();
    	oo.i=15;
    	oo.m2();
    }
}
