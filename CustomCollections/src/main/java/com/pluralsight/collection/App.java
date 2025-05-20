package com.pluralsight.collection;

import jdk.jshell.Snippet;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); //Fails because it is over size.

        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//        dates.add(15); Failing line because of a type error trying to put an int into an LocalDate list.

        System.out.println(dates);
    }
}
