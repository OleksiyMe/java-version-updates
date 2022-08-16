package com.cydeo.task;

import com.cydeo.Apples.ApplesByOzzy.Apple;
import com.cydeo.Apples.ApplesByOzzy.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {  //Anonymous Class
            @Override
            public boolean test(Apple apple) {

                return apple.getWeight() > 200;
            }
        };

        //***********************PREDICATE************
        Predicate<Integer> lesserThan = i -> i < 18;

        System.out.println(lesserThan.test(20));

        //***********************CONSUMER**************

        Consumer<Integer> display = i -> System.out.println("123");
        display.accept(1);

        //**************************BiCONSUMER********

        BiConsumer<Integer, Integer> addTwo =
                (x, y) -> System.out.println(x + y);

        addTwo.accept(2, 4);

        //**************************FUNCTION********

        Function<String, String> fun = s -> "Hello " + s;

        System.out.println(fun.apply("Cydeo"));
        //**************************BiFUNCTION********

        BiFunction<Integer, Integer, String> biFun = (a, b) -> {
            if (a == b) return "" + 0;
            else return "" + (a + b);

        };

        System.out.println(biFun.apply(10, 10));

        //**************************SUPPLIER**************

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }
}
