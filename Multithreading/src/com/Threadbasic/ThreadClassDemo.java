package com.Threadbasic;

public class ThreadClassDemo extends Thread{

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ->Thread is running..."+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		ThreadClassDemo t1=new ThreadClassDemo();
		t1.setName("My thread1");
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		
		ThreadClassDemo t2=new ThreadClassDemo();
		t2.setName("User Thread");
		t2.setPriority(MIN_PRIORITY);
		t2.start();
	}

}
