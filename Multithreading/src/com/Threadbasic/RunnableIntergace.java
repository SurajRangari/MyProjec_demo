package com.Threadbasic;

public class RunnableIntergace implements Runnable {
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		RunnableIntergace r1=new RunnableIntergace();
		Thread t1=new Thread(r1, "MyrunThread");
		t1.start();

	}

}
