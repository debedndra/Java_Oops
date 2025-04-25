package com.Jsp.Has_a_Relationship;

public class CarDriver {
	public static void main(String[] args)
	{
		//Car c1 = new Car("BMW",5484,"YELLOW",)//CTE
				Car c1 = new Car("BME",8548,"YELLOW",new Engine(2000));
				c1.display();
				c1.e.cc=3000;
				System.out.println("--------------------");
				c1.display();
	}

}
