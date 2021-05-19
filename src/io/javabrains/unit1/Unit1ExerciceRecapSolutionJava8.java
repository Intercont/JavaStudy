package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciceRecapSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Igor", "Fraga", 33),
                new Person("Fernanda", "Menezes", 23),
                new Person("Eda", "Maria", 73),
                new Person("Alguém", "Anônimo", 25)
        );

        //1st step: sort list by last name
//        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        //2nd step: create a method that prints all elements in the list
        System.out.println("Printando todo mundo: ");
        printConditionally(people, p -> true); //pra printar sempre todos, apenas retornar true para a condição

        //3th step: create a method that prints all people that have last name beggining with F
        System.out.println("Printando quem começa o sobrenome por F");
        printConditionally(people, p -> p.getLastName().startsWith("F"));
        //O pacote java.util.function contém diversas Interfaces out-of-the-box
//        java.util.function.Function
//
//        printConditionally(people, new Condicao() {
//            @Override
//            public boolean teste(Person p) {
//                return p.getAge() > 60;
//            }
//        });

        System.out.println("Printando quem tem mais de 60 anos");
        printConditionally(people, p -> p.getAge() > 60);
    }

//    private static void printConditionally(List<Person> people, Condicao condicao) {
    private static void printConditionally(List<Person> people, Predicate<Person> condicao) { //substituindo a nossa interface Condicao por uma desse pacote java.util.function default do Java 8, assim nem precisamos construir nenhuma interface
        for (Person p : people) {
            if (condicao.test(p)) {
                System.out.println(p);
            }
        }
    }
}