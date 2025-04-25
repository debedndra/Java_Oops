package com.Jsp.StringProg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDeom5 {
public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
	  System.out.println("Enter any String:");
	  String s = scn.next();
			
	  Pattern p=Pattern.compile("[0-9]+");
	  Matcher m=p.matcher(s);

		int sum=0;
		while(m.find()) {
				
		   sum+=Integer.parseInt(m.group());
	  }
		System.out.println(sum);
   }
}