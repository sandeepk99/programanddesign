package com.program.genericjava;

import com.program.general.PairSumCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaTest {

    @Test
    public void getName_isMatch_ifName_isAndy() {
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
        Assertions.assertEquals(true, Lambda.getPersonName(persons));
    }

    @Test
    public void getName_isNull_ifName_isOtherThan_Andy() {
        List<Person> persons = new ArrayList<Person>();
        Person p1 = new Person("Tim", 21);
        Person p2 = new Person("Sam", 24);
        Person p3 = new Person("Ram", 20);
        Person p4 = new Person("Jay", 19);
        Person p5 = new Person("Raj", 29);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        Assertions.assertEquals(false, Lambda.getPersonName(persons));
    }

    @Test
    public void getName_isNull_ifName_isNull() {

        Assertions.assertEquals(false, Lambda.getPersonName(null));
    }
}
