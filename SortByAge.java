package com.Jsp.ComparableImple;

import java.util.Comparator;

public class SortByAge implements Comparator{
 
 public int compare(Object o1, Object o2)
 {
	 Student s1=(Student) o1;
	 Student s2=(Student) o2;
	 return s1.name.compareTo(s2.name);
 }
}
