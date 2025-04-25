package com.Jsp.ListImplemnts;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(40);
		l.add(60);
		
		System.out.println("size="+l.size());
		for(int i=0; i<l.size(); i++)
		{
			System.out.println((Integer)l.get(i));
		}
	}
}
