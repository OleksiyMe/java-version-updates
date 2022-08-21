package com.cydeo;

import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {



        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

int sum=0;
        for (Integer number : numbers) {
            sum+=number;
        }
int sum1 =numbers.stream().reduce(0,(a,b)->a+b);

        System.out.println("sum = " + sum);
        System.out.println("sum1 = " + sum1);

//COUNT
     long count =   DishData.getAll().stream().count();
        System.out.println(count);

    }
}
