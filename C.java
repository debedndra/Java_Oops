package com.Jsp.Blocks;

public class C {
	int i;
	{
		i=30;
		//Non-Static Block
	}
	public static void msin(String[] args)
	{
		C c = new C();
		System.out.println(c.i);
	}

}
