package com.cydeo.task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

//PrintAllEmails
        System.out.println("Print All Emails");

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

//print All Phone Numbers
        EmployeeData.readAll()
                .flatMap(r->r.getEmpPhoneNumbers().stream())

                .forEach(r-> System.out.println(r));
        System.out.println("=====");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)


                .forEach(r-> System.out.println(r));


    }
}
