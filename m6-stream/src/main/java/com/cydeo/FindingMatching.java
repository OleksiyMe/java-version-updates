package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.DishTask;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.IntStream;

public class FindingMatching {


    public static void main(String[] args) {














        //ALL MATCH
        System.out.println("//ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //ANY MATCH
        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("Menu is vegetarian friendly");
        }

        //NONE MATCH
        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(
                dish -> dish.getCalories() >= 1000);

        System.out.println(isHealthy2);

        //FIND ANY
        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println("dish = " + dish.get());

        //FIND FIRST
        System.out.println("FIND FIRST");
        Optional<Dish> dish1 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println("dish = " + dish1.get());


        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1= Arrays.asList("John", "David", "Jack", "Duke","Julia","Divya");
        List<String> list2= Arrays.asList("John", "David", "Jack", "Duke","Julia","Divya");

        Optional<String> findFirst= list1.stream().parallel().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny= list2.stream().parallel().filter(s->s.startsWith("J")).findAny();

        System.out.println(findFirst);
        System.out.println(findAny);


       Optional<Dish> dishMin= DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));

        System.out.println(dishMin.get());

        Optional<Dish> dishMax= DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));

        System.out.println(dishMax.get());

    Integer totalCal= DishData.getAll().stream().map(Dish::getCalories).reduce(0,(a,b)->a+b);

        System.out.println("totalCal = " + totalCal);

        Integer totalCa2= DishData.getAll().stream().map(Dish::getCalories).reduce(0, Integer::sum);

        System.out.println("Our TEST");
        List<Integer> list = new ArrayList<>(Arrays.asList(4));

        Optional abc=  list.stream()
                .reduce((a,b)->a*b);
        System.out.println(abc);
        System.out.println(abc.get());
       // System.out.println(abc);

        Integer abcMin=  list.stream()
                .reduce(Integer::min).get();
        System.out.println("abcMin = " + abcMin);

        Integer abcMax=  list.stream()
                .reduce(Integer::max).get();
        System.out.println("abcMax = " + abcMax);

        Integer abcNext=  list.stream()
                .reduce(Integer::rotateLeft).get();
        System.out.println("abcNext = " + abcNext);

       // list.stream().


    }


}
