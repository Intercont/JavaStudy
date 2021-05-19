package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Unit1ExerciceRecapSolutionJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Igor", "Fraga", 33),
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
        printAll(people);

        //3th step: create a method that prints all people that have last name beggining with F
        printConditionally(people, new Condicao() {
            @Override
            public boolean teste(Person p) {
                return p.getLastName().startsWith("F");
            }
        });

        printConditionally(people, new Condicao() {
            @Override
            public boolean teste(Person p) {
                return p.getAge() > 60;
            }
        });
    }

    private static void printConditionally(List<Person> people, Condicao condicao) {
        for (Person p : people) {
            if (condicao.teste(p)) {
                System.out.println(p);
            }
        }
    }


    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}

@FunctionalInterface
interface Condicao {
    boolean teste(Person p);
}

