package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5);
        //  list.forEach(System.out::println);

        //FILTER
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        System.out.println("======================================");
        //DISTINCT
        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();

        str.forEach(System.out::println);

        str.close();
        System.out.println("======================================");
        //LIMIT
        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);
        System.out.println("======================================");
        //SKIP
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("======================================");
        list.stream()
                .map(i->i*3)
                .forEach(System.out::println);

        System.out.println("===========================");
        List<String> list2=Arrays.asList("Java", "Python");

        list2.stream()
                .forEach(i-> System.out.println(i.length()));


    }
}
