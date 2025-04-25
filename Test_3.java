package com.Jsp.StringProg;

public class Test_3 {
	public static void main(String[] args)
	{
		String s1="java"+"dev";
		String s2="dev";
		String s3="java"+s2;
		String s4="javadev";
		
		System.out.println(s1==s3);
		System.out.println(s1==s1);
		System.out.println(s3==s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}