package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.*;

public class DishTask {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );

        out.println("dishes <400 calories");
        menu.stream()
                .filter(i->i.getCalories()<400)
                .map(Dish::getName)
                .forEach(out::println);

        out.println("lengthes of the names");
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(out::println);

        out.println("3 dishes >300 calories");
        menu.stream()
                .filter(i->i.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(out::println);

        out.println("dishes <400 calories sorted");
        menu.stream()
                .filter(i->i.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(out::println);

    }
}
