package com.Jsp.StringProg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo6 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("([a-z])([a-z])\\2");
		Matcher m=p.matcher("abaabb");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}
	}
}