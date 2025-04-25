package com.Jsp.StringProg;

public class Test_2 {
	public static void main(String[] args)
	{
		String s = "QSPIDERS";
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='I')
				ch[i]='i';
			System.out.println(ch[i]);
		}
	}
}
