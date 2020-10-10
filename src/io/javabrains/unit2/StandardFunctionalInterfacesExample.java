package io.javabrains.unit2;

import io.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

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
        performConditionally(people, person -> true, p -> System.out.println(p)); //para imprimir todos, a condição sempre é verdadeira!

        //3th step: create a method that prints all people that have last name beggining with F
        System.out.println("Prints all last names with F");
        performConditionally(people, p -> p.getLastName().startsWith("F"), p -> System.out.println(p));

        System.out.println("Prints all last names with M");
        performConditionally(people, person -> person.getLastName().startsWith("M"), p -> System.out.println(p.getLastName()));

        System.out.println("Prints all first names with I");
        performConditionally(people, person -> person.getFirstName().startsWith("I"), p -> System.out.println(p.getFirstName()));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) { //substituindo a interface por um predicado
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
//                System.out.println(p);
            }
        }
    }
}