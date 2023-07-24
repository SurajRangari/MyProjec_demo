package com.lambda;

interface Speedable
{
	public void changeSpeed(int speed);
	
	default void start(String obj)
	{
		System.out.println(obj+" : Started....");
	}
}

public class LamdaWithParameter {

	public static void main(String[] args) {
		
		Speedable car=(speed)->{
			System.out.println("Car has increased speed by "+speed+"km/hr.");
		};
		car.start("Car");
		car.changeSpeed(30);
		
	}

}
