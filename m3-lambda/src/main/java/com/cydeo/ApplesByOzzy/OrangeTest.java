package com.cydeo.ApplesByOzzy;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.RED));
        inventory.add(new Orange(50, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";

        printApple(inventory, orangeLambda);
        System.out.println("==============================");
        printApple(inventory, orange -> {
            if (orange.getColor().equals(Color.GREEN)) return orange.toString();
            else return null;
        });

    }

    private static void printApple(List<Orange> list, OrangeFormatter o) {

        for (Orange orange : list) {

            String output = o.test(orange);
            System.out.println(output);

        }

    }

}
