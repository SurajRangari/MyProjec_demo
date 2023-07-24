package com.lambda;

public class WithLambda {

	public static void main(String[] args) {
		
		movable truck=()->{
			System.out.println("Truck is moving with speed 60km/hr");
		};
		truck.move();

	}

}
