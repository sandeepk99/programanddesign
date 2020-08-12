package com.program.genericjava;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        Person p1 = new Person("Andy", 21);
        Person p2 = new Person("Sam", 24);
        Person p3 = new Person("Ram", 20);
        Person p4 = new Person("Jay", 19);
        Person p5 = new Person("Raj", 29);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);


    }

    static Optional<Person> getPerson(List<Person> persons) {

        return Optional.ofNullable(persons).map(person -> person.stream()
                .filter(name -> "Andy".equalsIgnoreCase(name.getName()))
                .findFirst()).orElse(Optional.empty());
    }



    static boolean getPersonName(List<Person> persons) {
        return getPerson(persons).isPresent();
    }
}
