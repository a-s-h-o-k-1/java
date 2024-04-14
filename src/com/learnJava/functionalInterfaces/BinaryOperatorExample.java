package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> bo = (a, b) -> a * b;
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        // System.out.println(bo.apply(4,5));
        BinaryOperator<Integer> maxValue = BinaryOperator.maxBy(comparator);
        System.out.println("max value: "+maxValue.apply(4, 5));

        BinaryOperator<Integer> minValue = BinaryOperator.minBy(comparator);
        System.out.println("min value: "+maxValue.apply(4, 3));
    }
}
