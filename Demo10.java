package com.Jsp.CollectionFramework;
import java.util.*;
public class Demo10 {
public static void main(String[] args) {
	 Deque q=new ArrayDeque();
	 q.add(10);
	 q.add(20);
	 q.add(30);
	 q.addFirst(40);
	 q.addLast(50);
	 
	 System.out.println(q);
   }
}
