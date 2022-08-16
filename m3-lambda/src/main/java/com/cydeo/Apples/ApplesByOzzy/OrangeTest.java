package com.cydeo.Apples.ApplesByOzzy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.RED));
        inventory.add(new Orange(50, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";

        printOrange(inventory, orangeLambda);
        System.out.println("==============================");
        printOrange(inventory, orange -> {
            if (orange.getColor().equals(Color.GREEN)) return orange.toString();
            else return "Not GREEN";
        });
        System.out.println("======");
        printOrange(inventory,orange -> {
            if (orange.getWeight()>100) return "heavy "+"An orange of " + orange.getWeight() + "g";
            else return "light "+"An orange of " + orange.getWeight() + "g";

        });

        System.out.println("New lines below");
        printOrange1(inventory, orange -> orange.getWeight()>100);


    }

    private static void printOrange(List<Orange> list, OrangeFormatter o) {

        for (Orange orange : list) {

            String output = o.test(orange);
            System.out.println(output);

        }

    }


    private static void printOrange1(List<Orange> list, Predicate<Orange> p) {

        for (Orange orange : list) {

            if (p.test(orange)) System.out.println(orange);


        }

    }

}
