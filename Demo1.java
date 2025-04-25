package com.Jsp.Interface;
interface Washable
{
	//maker interface
}
class Car implements Washable
{	
}
class Bike implements Washable
{	
}
class Laptop
{
}
class Mobile
{
}
	class WasherMan
	{
		static void Wash(Object O)
		{
			if(O instanceof Washable)
			{
				System.out.println(O.getClass().getSimpleName()+" is Washed");
			}
			else
			{
				System.out.println(O.getClass().getSimpleName()+" is Not Washed");
			}
		}
	}
public class Demo1 {
public static void main(String[] args)
{
	Car c = new Car();
	Bike b = new Bike();
	WasherMan.Wash(c);
	WasherMan.Wash(b);
	WasherMan.Wash(new Laptop());
	WasherMan.Wash(new Mobile());
 }
}
