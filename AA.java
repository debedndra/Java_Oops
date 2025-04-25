package com.Jsp.Blocks;

public class AA {
static
{
	System.out.println("Static Block-1");
	AA a = new AA();
}
{
	System.out.println("Non-Static Block-1");
}
public static void main(String[] args)
{
	System.out.println("Main Starts");
	AA a = new AA();
	System.out.println("Main Ends");
}
{
	System.out.println("Non-Staic Block-2");
}
static
{
	AA a = new AA();
	System.out.println("Static Block -2");
}
}
