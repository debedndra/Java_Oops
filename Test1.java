package com.Jsp.ListImplemnts;

public class Test1 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(100);
		l.add(110);
		l.add(120);
		l.add(130);
		System.out.println("size="+l.size());
		for(int i=0; i<l.size(); i++)
		{
			System.out.println((Integer)l.get(i));
		}
	}
}
