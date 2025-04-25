package com.Jsp.Interface;
interface L1
{
	void m1();
}
class S
{
	  public void m1()
	{
		System.out.println("M1-S");
	}
}
class Q extends S implements L1
{
  @Override
  public void m1()
  {
	  super.m1();
	  System.out.println("M1-S");
  }
}
public class Tesst {
public static void main(String[] args)
{
	S s = new S();
	s.m1();
}
}
