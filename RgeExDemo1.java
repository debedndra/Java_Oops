package com.Jsp.StringProg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RgeExDemo1 {
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("a.c");
		Matcher m=p.matcher("1a2cabcac");
		
		System.out.println(m.find());
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
		System.out.println("==========");
		System.out.println(m.find());
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
		System.out.println("==========");
		System.out.println(m.find());
		//System.out.println(m.start());
		//System.out.println(m.end());
		//System.out.println(m.group());	
	}
}
