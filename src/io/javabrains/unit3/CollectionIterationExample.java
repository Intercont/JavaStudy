package io.javabrains.unit3;

import io.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Igor", "Fraga", 32),
                new Person("Fernanda", "Menezes", 23),
                new Person("Eda", "Maria", 71),
                new Person("Alguém", "Anônimo", 25)
        );

        //Old School Loop
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for in (former for each) loop");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("Using Java 8 forEach loop");
//        people.forEach(p -> System.out.println(p));
        people.forEach(System.out::println);
    }
}
