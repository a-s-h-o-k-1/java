package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (stu) -> stu.getGradeLevel() >= 3;

    public static void main(String[] args) {
        filterStudentByGradeLevel();
    }

    public static void filterStudentByGradeLevel() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(stu -> {
            if (p1.test(stu)) {
                System.out.println(stu);
            };
        });
    }


}
