package io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        int [] somenumbers = {1,2,3,4};
        int key = 2;

        process(somenumbers, key, wrapperLambda((i, k) -> System.out.println(i / k)));
    }

    private static void process(int[] somenumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : somenumbers) {
            consumer.accept(i, key);
        }
    }

    //construindo um Wrapper para o Lambda, assim conseguimos tirar dele o bloco de try catch
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Cagou");
            }
        };
    }
}
