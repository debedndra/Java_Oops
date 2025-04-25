package com.Jsp.CollectionFramework;
import java.util.*;
public class Demo7 {
public static void main(String[] args) {
	List l=new LinkedList();
	l.add(10);
	l.add(20);
	l.add(0, 30);
	
	System.out.println(l);
	l.set(1, 40);
	System.out.println(l);
  }
}
