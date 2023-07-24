package com.lambda;
interface movable
{
	void move();
}
public class WithoutLambda {
	public static void main(String a[])
	{
		//ananoymus class
		movable ball=new movable()
				{
			@Override
			public void move()
			{
				System.out.println("Ball is rolling at 30km/hr");
			}
				};
				ball.move();
	
		//ananoymus class		
	  movable car=new movable()
			  {
		  @Override
		  public void move()
		  {
			  System.out.println("Car is rolling at 150km/hr");
		  }
			  };
			  car.move();
	}
	

}
