package com.Jsp.StringProg;

public class ArrangString{
	public static void main(String[] args)
	{
		String s = "1AbCdE4Fg@#$23";
		String uc="";
		String lc="";
		String nc="";
		String sp="";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				uc+=ch;
			else if(ch>='a' && ch<='z')
				lc+=ch;
			else if(ch>='0' && ch<='9')
				nc+=ch;
			else
				sp+=ch;
		}
		s=uc+lc+nc+sp;
		System.out.println(s);
	}
}