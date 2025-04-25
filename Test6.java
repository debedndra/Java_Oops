package com.Jsp.Java8;

import java.util.function.Consumer;

public class Test6 {
   public static void main(String[] args) {
	String[] s= {"Java","Python","Mern","C++","HTML","CSS"};
	Consumer<String> cn = i-> System.out.println(i.toUpperCase());
	for(String str:s)
		cn.accept(str);
   }
}
