package io.javabrains.unit3;

import io.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Igor", "Fraga", 32),
                new Person("Fernanda", "Menezes", 23),
                new Person("Eda", "Maria", 71),
                new Person("Alguém", "Anônimo", 25)
        );


        people.stream()
                .filter(p -> p.getLastName().startsWith("M"))
                .forEach(p -> System.out.println(p.getFirstName()));

        people.stream()
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("M"))
                .count();

        System.out.println(count);

    }
}
