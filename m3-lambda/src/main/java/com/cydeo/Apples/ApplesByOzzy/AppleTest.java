package com.cydeo.Apples.ApplesByOzzy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(50, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        inventory.forEach(e -> System.out.println(e));


      /*  List<Apple> heavyApple = filterApples(inventory, new AllpeHeavyPredicate());
        System.out.println("heavyApple = " + heavyApple);
        List<Apple> greenApple = filterApples(inventory, new AppleGreenCplorPredicate());
        System.out.println("greenApple = " + greenApple);
        System.out.println("========================================");

        ApplePredicate weightApple = apple -> apple.getWeight() > 200;

       // filterApples(inventory, weightApple);
*/
        System.out.println("========");
        System.out.println(filterApples(inventory, apple -> apple.getWeight() > 200));
        System.out.println("========");
        System.out.println(filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN) ));

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterApples1(List<Apple> inventory, Predicate<Apple> p) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


}
