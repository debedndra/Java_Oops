package com.Jsp.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test4 {
  public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	Function<Integer,Integer> fn =i-> i*i;
	for(int n:l)
		System.out.println(fn.apply(n));
  }
}