package com.Jsp.StringProg;

public class RemDupChar {
	public static void main(String[] args) {
		String s="acdabcded";
		char[] ch=s.toCharArray();
		int temp=0;
		
		for(int i=0; i<ch.length; i++)
		{

			if(ch[i]=='\u0000')
				for(int j=i+1; j<ch.length; j++)
				{
					if(ch[i] == ch[j])
						ch[j]='\u0000';
				}
			System.out.println(temp);
		   }
	  }
}