package com.Jsp.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test5 {
   public static void main(String[] args) {
	List<String> l = Arrays.asList("10","20","30","4","50","60","70","8","90","100");
	int[] a= new int[l.size()];
	int c=0;
	Function<String,Integer> fn = i-> Integer.parseInt(i);
	for(String str:l) a[c++]=fn.apply(str);
		System.out.println(Arrays.toString(a));
   }
}
