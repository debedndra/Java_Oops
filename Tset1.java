package com.Jsp.ExceptionHanling;

public class Tset1 {
	public static void main(String[] args) {
	    System.out.println("Main Starts");
	    try {
	    	System.out.println(10/0);
	    	System.out.println("try Block");
	    }catch(ArithmeticException e) {
	    	System.out.println("Handled");
	    }
	    System.out.println("Main Ends");
	}
}
