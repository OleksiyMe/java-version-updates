package com.cydeo.killTheRabbit;

import java.util.function.Function;
import java.util.logging.SocketHandler;

public class Calculator {
    public static void main(String[] args) {

        //example with a reference variable for lambda expression
        Function<Double, Double> f1 = x -> Math.sqrt(x);
        System.out.println("SQRT from 100 is " + calculate(100d, f1));
        //example with a lambda expression as an argument
        System.out.println("SQRT from 100 is " + calculate(100d, x -> Math.sqrt(x)));

        //example with a reference variable for lambda expression
        Function<Integer, Double> f2 = x -> Math.sin(x);
        System.out.println("Sin from 30 is " + calculate(30, f2));
        //example with a lambda expression as an argument
        System.out.println("Sin from 30 is " + calculate(30, x -> Math.sin(x)));

        //==============================================================================================
        System.out.println("\nThe same with Method Reference");
        //example with a reference variable for method reference
        Function<Double, Double> f3 = Math::sqrt;
        System.out.println("SQRT from 10000 is " + calculate(10000d, f3));
        //example with a method reference as an argument
        System.out.println("SQRT from 10000 is " + calculate(10000d, Math::sqrt));

        //example with a reference variable for method reference
        Function<Integer, Double> f4 = Math::cos;
        System.out.println("Cos from 30 is " + calculate(30, f4));
        //example with a method reference as an argument
        System.out.println("Sin from 30 is " + calculate(30.0, Math::cos));
        System.out.println("Sin from 30 is " + calculate(30d, Math::cos));

        // Example with a String as a result
        Function<Double, String> f5 = x ->"" + Math.sqrt(x);
        System.out.println("SQRT from 100 is " + calculate(100d, f5));
        System.out.println(
                "SQRT from 100 is " + calculate(100d, x -> "" + Math.sqrt(x))
        );


    }

    private static <T extends Number, V> V calculate(T num, Function<T, V> f1) {
        return f1.apply(num);
    }
}
