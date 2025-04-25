package com.Jsp.Cloning;

public class PersonDriver {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Person p1 = new Person("BABU",23,987654321, new Address("Bangaluru","India"));
		Person p2 = (Person) p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("----------------------------------------------------------------------------------------------");
		p2.address.city="ODISHA";
		System.out.println(p1);
		System.out.println(p2);
	}

}
