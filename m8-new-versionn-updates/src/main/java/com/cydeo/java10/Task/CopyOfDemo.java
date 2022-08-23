package com.cydeo.java10.Task;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> unmodifilable = List.copyOf(list);
        List<Integer> unmodifiable1=List.of(1,2,3,4);


    }
}
