package com.Jsp.Interface;
interface J1
{
	void m1();
	void m2();
}
interface J2
{
	void m1();
	void m3();
}
 class B implements J1, J2
{
	@Override
	public void m1()
	{
		System.out.println("M1-B");
	}
	@Override
	public void m3()
	{
		System.out.println("M3-B");
	}
	public void m2()
	{
		System.out.println("M2-B");
	}
	public void m4()
	{
		System.out.println("M4-B");
	}
}
public class Demo {
public static void main(String[] args)
{

	J1 j1 = new B();
	j1.m1();
	j1.m2();
	System.out.println("--------------------");
	J2 j2 = new B();
	j2.m1();
	j2.m3();
	System.out.println("---------------------");
	B b = (B)j2;
	b.m4();
}
}
