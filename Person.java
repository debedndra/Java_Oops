package com.Jsp.Cloning;

public class Person implements Cloneable{
String name;
int age;
long mobileNum;
Address address;//(Has - a) reference Properties
public Person(String name, int age, long mobileNum,Address address)
{
	this.name=name;
	this.age=age;
	this.mobileNum=mobileNum;
	this.address=address;
}
@Override
public String toString()
{
	return "Person [Name=" + name+", age=" + age+",mobileNum=" + mobileNum+", Address=" + address+"]";
}
@Override
public Object clone() throws CloneNotSupportedException
{
	//return super.clone();// shallow clone
	Person p=(Person)super.clone();
    p.address=(Address)address.clone();//Deep clone
	return p;
}
}
