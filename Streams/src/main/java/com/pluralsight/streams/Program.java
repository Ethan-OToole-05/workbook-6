package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("bob", "last", 23));
        people.add(new Person("ethan", "otoole", 23));
        people.add(new Person("ethan", "person", 21));
        people.add(new Person("brad", "name", 22));
        people.add(new Person("pop", "old", 20));
        people.add(new Person("yuri", "tester", 37));
        people.add(new Person("davide", "bua", 33));
        people.add(new Person("lil", "bro", 31));
        people.add(new Person("nathan", "kasongo", 25));
        people.add(new Person("destiny", "udogie", 28));

//        people.stream().forEach(Person -> System.out.println(people));

        System.out.print("Please enter a first name to search:");
        String firstNameSearch = input.nextLine();

        //Step 1 for first name logic we search all the names and put it into an arraylist to print each matched name.

        ArrayList<Person> nameFilter = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(firstNameSearch))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(nameFilter);

//        for(Person person : people) {
//            if(person.getFirstName().equalsIgnoreCase(firstNameSearch)) {
//                System.out.println(person);
//            }
//        }


        //Step 2 returning the average of all ages.

        double averageAge = people.stream()
                        .mapToInt(Person::getAge).average().getAsDouble();

        System.out.println(averageAge);

        //Step 3 displaying the oldest age and youngest age in the list.

        int oldestAge = people.stream()
                .mapToInt(Person::getAge).max().getAsInt();
        System.out.println(oldestAge);

        int youngestAge = people.stream()
                .mapToInt(Person::getAge).min().getAsInt();
        System.out.println(youngestAge);

    }



}
