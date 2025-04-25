package com.Jsp.CollectionFramework;

import java.util.ArrayList;

public class Demo3 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(30);
		a1.add(60);
		a1.add(50);
		
		ArrayList a2=new ArrayList();
		a2.add(50);
		a2.add(60);
		
		System.out.println("a1="+a1);
		a1.removeAll(a2);
		System.out.println("a2="+a2);
	}
}
