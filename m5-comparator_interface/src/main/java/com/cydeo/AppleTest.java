package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {


    List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(50, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        inventory.forEach(e -> System.out.println(e));



}

}
