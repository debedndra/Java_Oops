package com.Jsp.ArrayPrograms;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] a= {5,4,2,8,7,6,9,3};
		int s1=a[0];
		int s2=a[0];
		int s3=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]==s1)
			{
				continue;
			}
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}else if (a[i]<s2 ||s1==s2)
			{
				s2=a[i];
			}
		}
		System.out.println("Secnod Smallest = "+s2);
	}
}
