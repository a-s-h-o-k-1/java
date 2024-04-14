package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = stu -> stu.getGpa() >= 3.9;
    Predicate<Student> p2 = stu -> stu.getGradeLevel() >= 3;
    BiConsumer<String, List<String>> studentNameandActivities = (name, activities) -> {
        System.out.println(name + "   :   " + activities);
    };
    Consumer<Student> c1 = stu -> {
        if (p1.and(p2).test(stu)) {
            studentNameandActivities.accept(stu.getName(), stu.getActivities());
        }
    };


    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
     new PredicateAndConsumerExample().printNamesAndActivities(students);
    }

    public  void printNamesAndActivities(List<Student> students) {
        students.forEach(c1);
    }
}
