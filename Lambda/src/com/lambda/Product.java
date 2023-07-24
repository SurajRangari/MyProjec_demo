package com.lambda;

public class Product {
	int noofProduct=15;
	
	public synchronized void produce(int noofProduct)
	{
		this.noofProduct=this.noofProduct+noofProduct;
		System.out.println(Thread.currentThread().getName()+" show no of product "+noofProduct);
		notify();
	}
	
	public synchronized void consume(int noofProduct)
	{
		if((this.noofProduct-noofProduct)<15)
		{
			System.out.println("insufficient product"+this.noofProduct);
			
		}
	}

}
