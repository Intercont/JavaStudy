package io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingRecapExample {

    public static void main(String[] args) {

        int [] somenumbers = {1,2,3,4};
        int key = 2;

//        process(somenumbers, key, (valor, chave) -> {
//            try {
//                System.out.println(valor / chave);
//            } catch (ArithmeticException e) {
//                System.out.println("Uma excessão aritmética ocorreu");
//            }
//        });
        //Para o BiConsumer passamos apenas o comportamento do que é esperado que ele faça com os valores que o accept dele receber

        process(somenumbers, key, wrapper((valor, chave) -> System.out.println(valor / chave)));
    }

    private static void process(int[] somenumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : somenumbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer) {
        System.out.println("Executando do Wrapper do Subway. Este cara ESTÁ FORA do Lambda, então NÃO É PASSADO no comportamento e não loopa no process");
        return (a, b) -> {
            System.out.println("Executando do Wrapper do Subway. Esse cara é passado no comportamento então ele loopa no process");
            try {
                consumer.accept(a, b);
            } catch (ArithmeticException e) {
                System.out.println("Caiu no Catch da divisão por ZERO");
            }
        };
    }

}
