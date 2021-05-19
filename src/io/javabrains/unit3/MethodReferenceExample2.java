package io.javabrains.unit3;

import io.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Igor", "Fraga", 32),
                new Person("Fernanda", "Menezes", 23),
                new Person("Eda", "Maria", 71),
                new Person("Alguém", "Anônimo", 25)
        );

        System.out.println("Prints all persons");
        performConditionally(people, person -> true, System.out::println); //p -> method(p) //Method Reference substituindo o Lambda com o argumento de entrada, o println é repassado para o Consumer, que já aguarda um argumento por default, daí que ele sabe que é esperado um arg
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) { //substituindo a interface por um predicado
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
