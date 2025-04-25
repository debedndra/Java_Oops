package com.Jsp.Blocks;

public class D {
	{
	System.out.println("Non-Static Block-1");
	
}
public static void main(String[] args)
{
	System.out.println("Main Starts");
	D d1 =new D();
	D d2 = new D();
	D d3 = new D();
	System.out.println("Main Ends");
}
{
	System.out.println("Non-Static Block-2");
}
{
	System.out.println("Non-Static Block-3");
}

}