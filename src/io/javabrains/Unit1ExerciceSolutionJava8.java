package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciceSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Igor", "Fraga", 32),
                new Person("Fernanda", "Menezes", 23),
                new Person("Eda", "Maria", 71),
                new Person("Alguém", "Anônimo", 25)
        );

        //1st step: sort list by last name - duas formas de ordenar, com Lambda e com Comparator
//        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        //2nd step: create a method that prints all elements in the list
        System.out.println("Prints all persons");
        printConditionally(people, person -> true); //para imprimir todos, a condição sempre é verdadeira!

        //3th step: create a method that prints all people that have last name beggining with F
        System.out.println("Prints all last names with F");
        printConditionally(people, p -> p.getLastName().startsWith("F"));

        System.out.println("Prints all last names with M");
        printConditionally(people, person -> person.getLastName().startsWith("M"));

        System.out.println("Prints all first names with I");
        printConditionally(people, person -> person.getFirstName().startsWith("I"));
    }

    private static void printConditionally(List<Person> people, Conditions condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}