package com.Jsp.CollectionFramework;
import java.util.*;
public class Demo9 {
public static void main(String[] args) {
	
	Queue q=new PriorityQueue();
	q.add(40);
	q.add(20);
	q.add(50);
	q.add(30);
	q.add(10);
	for(Object o:q)
	{
		System.out.println(q);
	}
  }
}