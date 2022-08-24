package com.cydeo.TEST1;

public class TestClass {
    public static void main(String[] args) {

        hi(6);
        hi("Peter");
        hi( new Cat("Litning"));
    }
    static <T> void hi(T t) {
        System.out.println(t + " Hi! " + t); // Works OK for both int&String&Cat parameters

        System.out.println(t + "" + t + " Hi! " + t); // Works OK for both int&String&Cat parameters

        // System.out.println(t+t+ " Hi! " +t); //Doesn't work. Reason "Operator + can not be applied to 'T'
    }

}

class Cat {
    public String name;
    public Cat(String name) {
        this.name = name;
    }
    public String toString() {
        return "I'm a cat, my name is" + name;
    }
}
