package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

   static  Function<List<Student>, Map<String, Double>> f =students -> {
        Map<String, Double> studentsAnditsGpa = new HashMap<>();
        students.forEach(stu->{
          if(PredicateStudentExample.p2.test(stu)){
              studentsAnditsGpa.put(stu.getName(), stu.getGpa());
          }
        });
        return studentsAnditsGpa;
    };


    public static void main(String[] args) {
        System.out.println(f.apply(StudentDataBase.getAllStudents()));
    }
}
