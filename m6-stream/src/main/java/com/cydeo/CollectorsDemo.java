package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

//to Collection(Supplier) -- creates Collection using Collector

        List<Integer> numbers = Arrays.asList(3, 4, 5, 5, 6, 6, 7);

        List<Integer> newList = numbers.stream()
                .filter(x -> x % 2 == 0)
                //       .reduce()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(newList);


        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);


        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        Set<Integer> set = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(set);

        Map<String, Integer> map = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(map);

        //summingInt

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //counting()

        long count = numbers.stream()
                .filter(x -> x % 2 == 0)
                //    .collect(Collectors.counting());
                .collect(Collectors.counting());

        System.out.println(count);

//averagingInt()
        Double average = DishData.getAll().stream()

                .collect(Collectors.averagingInt(Dish::getCalories));

        //joining()

        List<String> courses= Arrays.asList("Java","JS","TS");

        String str=        courses.stream()
                        .collect(Collectors.joining(","));   //Like concatenating
        System.out.println(str);

        //partitioningBy()

        Map<Boolean,List<Dish>> mapPart= DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(mapPart);


       Map<Type,List<Dish>> map2= DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println("\n"+map2);

    }
}
