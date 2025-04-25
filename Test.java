package com.Jsp.StringProg;

public class Test{
	public static void main(String[] args)
	{
		String s ="JSPIDERS";
		System.out.println(s.length());//8
		System.out.println(s.charAt(5));//E
	//	System.out.println(s.charAt(s.length()));//StringIndexOutOfBoundsException
		System.out.println(s.charAt(s.length()-5));//I
	}
}