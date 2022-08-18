package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {



        List<Integer> list=
                Arrays.asList(10,0,15,5,20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list)        ;
       /* Collections.reverse(list);
        System.out.println(list);*/

        System.out.println("================================================");
Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list,(o1,o2)->
                (o1>o2)? -1:(o1<o2)?1:0
                );

     //Ascending Order
     list.sort((o1,o2)->o1.compareTo(o2))   ;
        System.out.println(list);

        list.sort((o2,o1)->o1.compareTo(o2))   ;
        System.out.println(list);





    }
}
