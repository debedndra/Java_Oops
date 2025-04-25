package com.Jsp.Java8;
@FunctionalInterface
interface I3{
	boolean isEven(int n);
//default	boolean isOdd(int n) {
//	return false;
//} 
}
public class Tset2 {
  public static void main(String[] args) {
	I3 i1 = n-> n % 2 == 0;
//	I3 i2 = n-> n % 2 !=0;
	System.out.println(i1.isEven(7));
	System.out.println(i1.isEven(2));
}
}
