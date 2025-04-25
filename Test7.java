package com.Jsp.Java8;

import java.util.Scanner;
import java.util.function.Supplier;

class A
{
	int i;
	int j;
	public A(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString()
	{
		return "A[i=" + i + ", j" + j +"]";
	}
}
public class Test7 {
   public static void main(String[] args) {
	try(Scanner s = new Scanner(System.in)){
		Supplier<A> sp = () -> new A(s.nextInt(), s.nextInt());
		A a1=sp.get();
		A a2=sp.get();
		System.out.println(a1);
		System.out.println(a2);
	  }
   }
}
