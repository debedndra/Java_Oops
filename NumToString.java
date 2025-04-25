package com.Jsp.ExceptionHanling;

public class NumToString{
	public static void main(String[] args) {
		int num=78964211;
		convert(num/10000000," Crore");
		convert((num/100000)%100," Lakhs");
		convert((num/1000)%100," Thousand");
		convert((num/100)%10," Hundered");
		convert(num%100, "");
	}
	public static void convert(int n, String s)
	{
		String[] one= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String[] two={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		if(n<=19)
		{
			System.out.print(one[n]+" ");
		}else {
			System.out.print(two[n/10]+" "+one[n%10]+" ");
		}
		if(n!=0)
		{
			System.out.print(s+" ");
		}
	}
}
