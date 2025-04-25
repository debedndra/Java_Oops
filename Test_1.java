package com.Jsp.ArrayPrograms;

import java.util.Arrays;

public class Test_1 {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	System.out.println(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(arr);
	System.out.println(Arrays.toString(arr));
  }
public static void m1(int[] a)
{
	for(int i=1; i<a.length; i++)
	{
		a[i]++;
	}
  }
}