package com.cydeo.java14;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        var month = 4;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("February can have 28 or 29 days");
                break;
            default:
                System.out.println("invalid month");
        }

        System.out.println("************************************");

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
            case 4, 6, 9 -> System.out.println("30");
            case 2 -> System.out.println("28 or 29");
            default -> System.out.println("Wrong month");
        }

        int day1 = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        int day2 = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter year");
                int year = scan.nextInt();
                if (year % 4 == 0)
                    yield 29;
                else
                    yield 28;

            }

        default -> 0;
    }

    ;

}
}
