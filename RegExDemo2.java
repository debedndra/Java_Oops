package com.Jsp.StringProg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a.c");
		Matcher m = p.matcher("1abcabca1cac");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}
	}
}
