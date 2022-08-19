package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("Java", "Python");

        list.stream()
                .forEach(i-> System.out.println(i.length()));


    }
}
