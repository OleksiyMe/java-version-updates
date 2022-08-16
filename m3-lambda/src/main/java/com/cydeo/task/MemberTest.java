package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Mike", 22, Gender.MALE, "@");
        Person p2 = new Person("Ozzy", 22, Gender.MALE, "@");
        Person p3 = new Person("Oleksiy", 46, Gender.MALE, "@");
        Person p4 = new Person("Anna", 22, Gender.FEMALE, "@");
        Person p5 = new Person("H", 22, Gender.MALE, "@");
        Person p6 = new Person("Sumeye", 22, Gender.FEMALE, "@");
        Person p7 = new Person("Alena", 30, Gender.MALE, "@");

        List<Person> personlist = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
        printSelected(personlist, person -> person.getAge() > 22 || person.getGname().equals("Ozzy"));
        System.out.println("=========");
        printSelected(personlist,p-> p.getGender().equals(Gender.FEMALE));


    }

    private static void printSelected(List<Person> personlist, CheckMember checkAction) {
        List<Person> result = new ArrayList<>();
        for (Person each : personlist) {

            if (checkAction.test(each)) {
                result.add(each);
            }

        }
        System.out.println(result);

    }


}
