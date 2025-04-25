package com.Jsp.StringProg;

public class StringToInt{
	public static void main(String[] args)
	{
		String s = "1A2BC3D";
		int num=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			num=(num*10)+(ch-'0');
		}
		System.out.println(num);
	}
}