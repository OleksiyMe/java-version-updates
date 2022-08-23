package com.cydeo.java14;

public class UserTest {
    public static void main(String[] args) {



        User user=new User("Alex","11 Oak str");

        System.out.println(user.name());
        System.out.println(user.address());
        System.out.println(user.toString());
    }
}
