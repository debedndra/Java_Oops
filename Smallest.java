package com.Jsp.ArrayPrograms;
import java.util.Arrays;
public class Smallest{
public static void main(String[] args) {
	int[] a= {4,5,7,2,8,1,6,3};
	int Smallest=a[0];
	for(int i=1; i<a.length; i++)
	{
		if(a[i]<Smallest)
		{
			Smallest=a[i];
		}
	}
	System.out.println(Smallest);
}
}