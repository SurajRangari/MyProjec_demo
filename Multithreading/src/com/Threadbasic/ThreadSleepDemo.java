package com.Threadbasic;

public class ThreadSleepDemo extends Thread{
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ----->"+i);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		ThreadSleepDemo t1=new ThreadSleepDemo();
		ThreadSleepDemo t2=new ThreadSleepDemo();
		
	//	t1.start();
	//	t2.start();
		Thread r1;
		r1= new Thread(t1);
		r1.start();
		
		r1=new Thread(t2);
		r1.start();
		

	}

}
