package com.lambda;

interface Changable
{
	public int changeSpeed(int orgspeed);
	
	default void start(String obj)
	{
		System.out.println(obj+" : Started.....");
	}
}
public class LambdaWithParameter2 {

	public static void main(String[] args) {
		
		Changable car=(speed)->{
			/*
			System.out.println("Original speed:"+speed+"km/hr");
			speed+=20;
			return speed;
			*/
			return(speed+20);
		};
		car.start("Car");
		System.out.println("Car has increased speed to "+car.changeSpeed(30)+"km/hr.");
		
		//single line code:can remove body
		
		Changable bike=(speed)->(speed+10);
		bike.start("Bike");
		System.out.println("Bike has increased speed to "+bike.changeSpeed(20)+"km/hr.");
		
	}

}
