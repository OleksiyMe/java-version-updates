package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users=new ArrayList<>();
        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Emba",40));
        users.add(new User("Emma","Smith",25));




        //Print All Elements that last name Starts with E

        Predicate<User> predicate= user-> user.getLastname().startsWith("E");


/*
        for (User user : users) {
            if ( predicate.test(user)) System.out.println(user);
        }

        for (User user : users) {
            System.out.println(user);
        }*/
printname(users,user-> user.getLastname().startsWith("E"));
        System.out.println("==============================");
        printname(users,user-> true );

    }

    private static void printname(List<User> users,Predicate<User> p){

        for (User user : users) {
            if (p.test(user)) System.out.println(user);
        }

    }


}
