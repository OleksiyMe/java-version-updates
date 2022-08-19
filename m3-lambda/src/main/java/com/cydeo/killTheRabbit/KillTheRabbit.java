package com.cydeo.killTheRabbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KillTheRabbit {
    public static void main(String[] args) {

        Rabbit r1 = new Rabbit("Rabbit1", 13, EyesColor.BROWN);
        Rabbit r2 = new Rabbit("Rabbit2", 6, EyesColor.BLUE);
        Rabbit r3 = new Rabbit("Rabbit3", 17, EyesColor.GREEN);
        Rabbit r4 = new Rabbit("Rabbit4", 8, EyesColor.RED);
        Rabbit r5 = new Rabbit("Rabbit5", 11, EyesColor.BLUE);
        Rabbit r6 = new Rabbit("Rabbit6", 5, EyesColor.RED);
        Rabbit r7 = new Rabbit("Rabbit7", 16, EyesColor.BLUE);
        Rabbit r8 = new Rabbit("Rabbit8", 3, EyesColor.RED);

        List<Rabbit> listOfRabbits = Arrays.asList(r1, r2, r3, r4, r5, r6, r7, r8);

        Predicate<Rabbit> condition = rabbit ->
                (rabbit.getEyeColor() == EyesColor.RED) && (rabbit.getWeight() == 5);

        for (Rabbit eachRabbit : sortTheRabbits(listOfRabbits, condition)) {
            System.out.println(eachRabbit);
        }

    }

    private static List<Rabbit> sortTheRabbits(List<Rabbit> list, Predicate<Rabbit> p) {
        List<Rabbit> result = new ArrayList<>();

        for (Rabbit each : list) {
            if (p.test(each)) result.add(each);
        }
        return result;
    }
}
