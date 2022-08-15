package com.cydeo.ApplesByOzzy;

public class AppleGreenCplorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
