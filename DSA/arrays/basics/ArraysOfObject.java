package arrays.basics;
import java.util.*;

public class ArraysOfObject {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Aashish", "CSE", 22);
        students[1] = new Student("Preeti", "AG", 20);
        System.out.println(Arrays.toString(students));
        System.out.println(students[0].age);
    }
}

class Student{
    String name;
    String course;
    int age;
    public Student(String name, String course, int age){
        this.name = name;
        this.course = course;
        this.age = age;
    }
}