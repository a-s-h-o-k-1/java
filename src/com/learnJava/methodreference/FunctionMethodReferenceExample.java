package com.learnJava.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> functionFunctionalInterfaceWithoutMethodReference = (s) -> s.toUpperCase();
    static Function<String, String> functionFunctionalInterfaceWithMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(functionFunctionalInterfaceWithMethodReference.apply("ashok kumar"));
    }
}
