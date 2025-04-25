package com.Jsp.CollectionFramework;

public class Circle implements Comparable <Circle>{
      int radius;
 public void Circele(int radius)
 {
	 this.radius=radius;
 }
 public int compareTo(Circle e)
 {
	 return radius-e.radius;
 }
}
