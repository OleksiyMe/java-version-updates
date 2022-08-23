package com.cydeo.java13;

public class TextBlockDemo {

    public static void main(String[] args) {


        var address = "9122 Block Dr. \n" +
                "McLean , VA `123124";


        System.out.println(address);

        System.out.println("=====================================");

        var address2 = """
                9122 Block Dr.
                "McLean , VA `123124"
                    """;


        System.out.println(address2);
    }
}
