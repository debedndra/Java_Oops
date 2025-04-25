package com.Jsp.Has_a_Relationship;

public class SimCard {
	String name;
	long num;
	public SimCard(String name, long num)
	{
		this.name=name;
		this.num=num;
	}
	public void display()
	{
		System.out.println(name+"\n"+num);
	}

}
