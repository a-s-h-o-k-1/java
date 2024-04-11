package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.*;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        //real world example
        printStudents();

    }

    public static void printStudents() {
        Consumer<Student> c1 = (s) -> System.out.println(s.getName());
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c1);
    }
}
