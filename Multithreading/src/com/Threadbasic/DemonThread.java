package com.Threadbasic;

public class DemonThread extends Thread {
	
	@Override
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Demon:"+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("User:"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		DemonThread t1=new DemonThread();
		DemonThread t2=new DemonThread();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
	}

}
