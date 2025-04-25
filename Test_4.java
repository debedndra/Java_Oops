package com.Jsp.ArrayPrograms;

public class Test_4 {
public static void main(String[] args) {
	Object[] o=new Object[5];
	o[0]=10;
	o[1]=3.45;
	o[2]="C";
	o[3]=new A(10);
	o[4]="Java";
	
	for( Object O:o)
	{
		System.out.println(o);
	}
}
}
