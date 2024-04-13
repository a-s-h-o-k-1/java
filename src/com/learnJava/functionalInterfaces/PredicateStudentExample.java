package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (stu) -> stu.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (stu) -> stu.getGpa() >= 3.9;

    public static void main(String[] args) {
//        filterStudentByGradeLevel();
//        filterStudentByGpa();
        filterStudents();
    }

    public static void filterStudents() {
        System.out.println("filterStudents; ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(stu -> {
            if (p1.and(p2).test(stu)) {
                System.out.println(stu);
            }
            //same like use or and negate
        });
    }

    public static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa; ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(stu -> {
            if (p2.test(stu)) {
                System.out.println(stu);
            }
            ;
        });
    }

    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel; ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(stu -> {
            if (p1.test(stu)) {
                System.out.println(stu);
            }
            ;
        });
    }


}
