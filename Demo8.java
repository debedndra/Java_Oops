package com.Jsp.CollectionFramework;
import java.util.*;
public class Demo8 {
public static void main(String[] args) {
	List l=new LinkedList();
	l.add(50);
	l.add(20);
	l.add(10);
	l.add(30);
	l.add(40);
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
   }
}
