package com.Jsp.Interface;
interface Regulater
{
	void increaseSpeed();
	void decreaseSpeed();
}
interface Switch
{
	void off();
	void on();
}
class Fan implements Regulater,Switch
{
	@Override
	public void increaseSpeed()
	{
		System.out.println("Increase  Fan Speed");
	}
	@Override
	public void decreaseSpeed()
	{
		System.out.println("Decrease Fan Speed");
	}
	@Override
	public void off()
	{
		System.out.println("Fan Off");
	}
	@Override
	public void on()
	{
		System.out.println("Fan On");
	}
}
public class FanDriver {
public static void main(String[] args)
{
	Regulater r = new Fan();
	r.increaseSpeed();
	r.decreaseSpeed();
	System.out.println("---------------------");
	Switch s = new Fan();
	s.off();
	s.on();
	System.out.println("---------------------");
	Fan f = new Fan();
	f.increaseSpeed();
	f.decreaseSpeed();
	f.off();
	f.on();
}
}
