package com.Jsp.StringProg;

public class CountChar{
	public static void main(String[] aegs)
	{
		String s = "123QSPIDERS!#@";
		int uc=0;
		int lc=0;
		int nc=0;
		int sp=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a' && ch<='z')
				lc++;
			else if(ch>'0' && ch<='9')
				nc++;
			else
				sp++;
		}
		System.out.println("UpperCase:"+uc);
		System.out.println("LowerCase:"+lc);
		System.out.println("NumberCase:"+nc);
		System.out.println("SpecialCase:"+sp);
	}
}