package com.Jsp.StringProg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo3 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a[12]{2}c");
		Matcher m=p.matcher("1abcabbbbac");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}
	}
}
