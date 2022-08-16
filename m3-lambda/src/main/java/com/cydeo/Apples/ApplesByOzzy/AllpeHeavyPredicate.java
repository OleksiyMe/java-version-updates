package com.cydeo.Apples.ApplesByOzzy;

public class AllpeHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {

        return apple.getWeight()>200;
    }
}
