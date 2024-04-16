package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
   // static Predicate<Student> p1 = (stu)->stu.getGradeLevel()>=3.9;

    //refactor into method reference
    static Predicate<Student> p1 =RefactorMethodReferenceExample::getStudent;
    public static boolean getStudent(Student s){
        return  s.getGradeLevel()>=3.9;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.createStudent.get()));
    }
}
