package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = stu -> stu.getGpa() >= 3.9;
    Predicate<Student> p2 = stu -> stu.getGradeLevel() >= 3;
    BiPredicate<Integer,Double> bp = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;
    BiConsumer<String, List<String>> studentNameandActivities = (name, activities) -> {
        System.out.println(name + "   :   " + activities);
    };
    Consumer<Student> c1 = stu -> {
        if (p1.and(p2).test(stu)) {
            studentNameandActivities.accept(stu.getName(), stu.getActivities());
        }
    };
    Consumer<Student> c2 = stu -> {
        if (bp.test(stu.getGradeLevel(),stu.getGpa())) {
            studentNameandActivities.accept(stu.getName(), stu.getActivities());
        }
    };


    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
     new PredicateAndConsumerExample().printNamesAndActivities(students);
    }

    public  void printNamesAndActivities(List<Student> students) {
      //  students.forEach(c1);
        students.forEach(c2);
    }
}
