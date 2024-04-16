package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<Student>> studentsList = ()-> StudentDataBase.getAllStudents();
        System.out.println(studentsList.get());
    }
}
