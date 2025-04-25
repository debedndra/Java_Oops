package com.Jsp.ComparableImple;

public class Student implements Comparable<Student> {
     String name;
     int age;
     int Id;

    public Student(String name, int age, int i) {
        this.name = name;
        this.age = age;
        this.Id = i;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return Id;
    }
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.age, s.age);
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", Id=" + Id + "}";
    }
}
