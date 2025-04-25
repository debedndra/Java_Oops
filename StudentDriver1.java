package com.Jsp.ComparableImple;

import java.util.Arrays;

public class StudentDriver1 {
	public static void main(String[] args) {
		Student s1= new Student("kalki",25,1);
		Student s2=new Student("Niklesh",26,2);
		Student s3=new Student("Satish",27,3);
		Student s4=new Student("Rakesh",29,4);
		Student s5=new Student("Ravi",30,5);
		Student[] s={s1,s2,s3,s4,s5};
		
		Arrays.sort(s);
		for(Student st:s)
		{
			System.out.println(st);
		}
	}
}
