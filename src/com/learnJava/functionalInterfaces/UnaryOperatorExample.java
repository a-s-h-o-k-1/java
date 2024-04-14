package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
  static   UnaryOperator<String> uo = (data)->data.concat(" kumar");
    public static void main(String[] args) {
        System.out.println(uo.apply("ashok"));
    }
}
