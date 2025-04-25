package com.Jsp.CollectionFramework;

import java.util.LinkedList;

public class Demo6 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(30);
		l.add(50);
		l.add(20);
		
		Object[] arr=l.toArray();
		for(Object o:arr)
		{
			System.out.println(o);
		}
	}
}
