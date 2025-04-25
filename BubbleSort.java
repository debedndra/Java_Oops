package com.Jsp.ArrayPrograms;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int[]a = {4,7,6,8,9,5,2,3};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
}
public static void sort(int[] a)
{
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a.length; j++)
		{
			if(a[i]> a[j+1])
			{
				int temp=a[i];
				a[i]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
