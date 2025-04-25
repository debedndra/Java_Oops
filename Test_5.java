package com.Jsp.ArrayPrograms;

import java.util.Arrays;

public class Test_5 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] b=new int[10];
		System.out.println(Arrays.toString(b));
		 System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(Arrays.toString(b));
				
	}
}
