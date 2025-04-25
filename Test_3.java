package com.Jsp.ArrayPrograms;
interface I
{
	void m1();
}
class B implements I
{
	public void m1()
	{
		System.out.println("M1 in B");
	}
	public void m2()
	{
		System.out.println("M2 in B");
	}
}
class C implements I
{
	public void m1()
	{
		System.out.println("M1 in C");
	}
	public void m2()
	{
		System.out.println("M2 in C");
	}
	public void m3()
	{
		System.out.println("M3 in C");
	}
}
public class Test_3 {
	public static void main(String[] args) {
		I[] a=new I[5];
		a[0]=new B();
		a[1]=new C();
		a[2]=new B();
		a[3]=new C();
		a[4]=new B();
		
		for(I obj:a)
		{
			obj.m1();
			if(obj instanceof B)
			{
				((B)obj).m2();
			}
			if(obj instanceof C)
			{
				((C)obj).m3();
			}
		}
	}
}
