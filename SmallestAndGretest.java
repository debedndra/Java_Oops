package com.Jsp.ArrayPrograms;

public class SmallestAndGretest {
	public static void main(String[] args) {
		int[] a= {4,2,5,8,7,1,6,3};
		int Smallest=a[0];
		int Biggest=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<Smallest)
			{
				Smallest=a[i];
			}
			if(a[i]>Biggest)
			{
				Biggest=a[i];
			}
		}
		System.out.println(Smallest);
		System.out.println(Biggest);
	}
}
