package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        printStudentNamesAndActivites();
    }

    public static  void printStudentNamesAndActivites(){
        BiConsumer<String, List<String>> studentAnditsActivities =
                (name, activites) -> {
                    System.out.println(name + "   :   " + activites);
                };
     List<Student> students =   StudentDataBase.getAllStudents();
     students.forEach(student ->studentAnditsActivities.accept(student.getName(),student.getActivities()) );
    }
}
