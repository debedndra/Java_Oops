package com.Jsp.Constructors;

public class B {
	B(int i)
	{
		System.out.println("B(int i) Cons:"+i);
	}
public static void main(String[] args)
{
	//new B();//CTE
	new B(10);
	new B(20);
	new B(30);
	new B(40);
	new B(50);
}
}
