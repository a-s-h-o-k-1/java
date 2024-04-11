package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.*;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = (s) -> System.out.println(s.getName());
    static Consumer<Student> c2 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c3 = (s) -> System.out.println(s.getActivities());
    static Consumer<Student> c4 = (s) -> {
        if (s.getGradeLevel() >= 3 && s.getGpa() >= 3.9)
            System.out.println(s);
    };

    public static void main(String[] args) {
        //real world example
        printStudents();
        printStudentNamesAndActivities();
        printStudentsWithSpecificGrade();

    }

    public static void printStudents() {
        System.out.println("printStudents:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c1);
    }

    public static void printStudentNamesAndActivities() {
        System.out.println("printStudentNamesAndActivities:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2.andThen(c3));
    }

    public static void printStudentsWithSpecificGrade() {
        System.out.println("printStudentsWithSpecificGrade:");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c4);
    }

}
