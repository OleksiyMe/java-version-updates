package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {


        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));

        System.out.println(courses);

        //Creating unmodifiable after java9
        List<String> courses1 = List.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set after java9
        Set<String> myProducts = Set.of("Milk", "Bread", "Butter");

        //Creating unmodifiable Map after java9
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV", 1),
                Map.entry("PSP 5", 1),
                Map.entry("Chair", 5)

        );


    }
}
