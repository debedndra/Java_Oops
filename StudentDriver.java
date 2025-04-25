package com.Jsp.ComparableImple;

import java.util.Arrays;

public class StudentDriver {

    public static void main(String[] args) {
        Student s1 = new Student("Akash", 24, 1);
        Student s2 = new Student("Santosh", 26, 2);
        Student s3 = new Student("Kalu", 23, 4);
        Student s4 = new Student("Abhi", 28, 4);
        Student s5 = new Student("Anil", 30, 5);

        Student[] s = { s1, s2, s3, s4, s5 };
        Arrays.sort(s);

        for (Student st : s) {
            System.out.println(st);
        }
    }
}
