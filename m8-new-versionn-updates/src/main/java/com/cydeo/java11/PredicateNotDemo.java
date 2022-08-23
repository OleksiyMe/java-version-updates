package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Predicate<Integer> even= i-> i%2==0;
        Predicate<Integer> odd= i-> i%2!=0;
        Predicate<Integer> odd2= Predicate.not(even);


        List<Integer>  even1 = list.stream()
                .filter(even)
                .collect(Collectors.toList());


        List<Integer>  even2 = list.stream()
                .filter(Predicate.not(even))
                .collect(Collectors.toList());


    }
}
