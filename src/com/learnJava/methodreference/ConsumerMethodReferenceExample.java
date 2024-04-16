package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /*
     Consumer<Student> c1 =(stu)-> System.out.println(stu);
     */
    /*
    className::MethodName
     */
    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = Student::printListofActivities;
    public static void main(String[] args){
          StudentDataBase.getAllStudents().forEach(c3);

    }
}
