package com.Jsp.StringProg;

public class Palindrome {
	public static void main(String[] args)
	{
		String s = "madaM";
		if(isPalindrome(s))
			System.out.println(s+" Is a Palidrome String");
		else
		    System.out.println(s+" Is not a Palindrome String");
	}
	public static boolean isPalindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
		if(s.charAt(i) != s.charAt(j))
			return false;
			i++;
			j--;
	  }
		return true;
	}
}