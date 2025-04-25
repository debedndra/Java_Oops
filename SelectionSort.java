package com.Jsp.ArrayPrograms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a= {4,9,8,1,2,5,7,2};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a) {
		for(int i=1; i<a.length; i++)
		{
			int index=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[index]) index =j;
			}
			if(i!=index)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}

}
