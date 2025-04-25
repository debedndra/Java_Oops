package com.Jsp.Binding;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Vehicle {
	void Start()
	{
		
	}
	void Acclerate()
	{
		
	}
	void Stop()
	{
		
	}
}
class BMW extends Vehicle
{
	@Override
	void Start()
	{
		System.out.println("BMW Started");
	}
	@Override
	void Acclerate()
	{
		System.out.println("BMW Going....");
	}
	@Override
	void Stop()
	{
		System.out.println("BMW Stoped");
	}
}
class AUDI extends Vehicle
{
	@Override
	void Start()
	{
		System.out.println("AUDI Started");
	}
	@Override
	void Acclerate()
	{
		System.out.println("AUDI Going...");
	}
	@Override
	void Stop()
	{
		System.out.println("AUDI Stoped");
	}
}
class BENZ extends Vehicle
{
	@Override
	void Start()
	{
		System.out.println("BENZ Started");
	}
	@Override
	void Acclerate()
	{
		System.out.println("BENZ Going.....");
	}
	@Override
	void Stop()
	{
		System.out.println("BENZ Stoped");
	}
}
public class VehicleDriver
{
	static void CarDriver(Vehicle v)
	{
		v.Start();
		v.Acclerate();
		v.Stop();
		//Late Binding
	}
	public static void main(String[] args)
	{
		CarDriver(new BMW());
		System.out.println("---------------");
		CarDriver(new AUDI());
		System.out.println("---------------");
		CarDriver(new BENZ());
	}
}
