package com.Jsp.Has_a_Relationship;

public class Car {
    String name;
    int carNum;
    String colour;
    Engine e;
    public Car(String name,int carNum,String colour,Engine e)
    {
    	this.name=name;
    	this.carNum=carNum;
    	this.colour=colour;
    	this.e=e;
    }
    public void display()
    {
    	System.out.println(name);
    	System.out.println(carNum);
    	System.out.println(colour);
    	System.out.println(e.cc);
    }
}

