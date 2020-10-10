package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciceSolutionJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Igor", "Fraga", 32),
                new Person("Fernanda", "Menezes", 23),
                new Person("Eda", "Maria", 71),
                new Person("Alguém", "Anônimo", 25)
        );

        //1st step: sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getLastName().compareTo(t1.getLastName());
            }
        });

        //2nd step: create a method that prints all elements in the list
        System.out.println("Prints all persons");
//        printAll(people);
        printConditionally(people, new Conditions() {
            @Override
            public boolean test(Person person) {
                return true; //para imprimir todos no Java 7
            }
        });

        //3th step: create a method that prints all people that have last name beggining with F
        System.out.println("Prints all last names with F");
        printConditionally(people, new Conditions() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("F");
            }
        });

        System.out.println("Prints all last names with M");
        printConditionally(people, new Conditions() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("M");
            }
        });

        System.out.println("Prints all first names with I");
        printConditionally(people, new Conditions() {
            @Override
            public boolean test(Person person) {
                return person.getFirstName().startsWith("I");
            }
        });
    }

    private static void printConditionally(List<Person> people, Conditions condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

//    private static void printAll(List<Person> people) {
//        for (Person p : people) {
//            System.out.println(p);
//        }
//    }
}

interface Conditions {
    boolean test(Person person);
}
