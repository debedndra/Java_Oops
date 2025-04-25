package com.Jsp.ArrayPrograms;
import java.util.Arrays;

class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+i;
	}
}
public class Test_2 {
public static void main(String[] args) {
	A[] arr = new A[10];
	arr[0]=new A(10);
	arr[1]=new A(20);
	arr[2]=new A(30);
	arr[3]=new A(40);
	arr[4]=new A(50);
	for(A obj:arr)
	{
		System.out.println(obj);
	}
	System.out.println(Arrays.toString(arr));
}
}