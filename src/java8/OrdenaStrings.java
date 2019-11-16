package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Igor");
        palavras.add("Avancini");
        palavras.add("Fraga");

        //TRIPÉ DO JAVA 8: DEFAULT METHODS NAS INTERFACES, LAMBDAS E METHOD REFERENCES

//        Comparator<String> comparator = new ComparadorPorTamanho();

//        Collections.sort(palavras, comparator); //ñ é mais necessário chamar o sort de Collections, pois a List já possui o sort
        palavras.sort((s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            }

            if (s1.length() > s2.length()) {
                return 1;
            }

            return 0;
        });
        //resumido para isto
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); //lambda

        //usando Comparator
        palavras.sort(Comparator.comparingInt(s -> s.length())); //substituido por method references

        //para entender melhor, vamos quebrar um por um para ver o que cada um deles faz
        Function<String, Integer> funcao = s -> s.length(); //o lambda gera uma Function
        funcao = String::length; //Também pode ser passada com um Method Reference (que também é um lambda) quando for para uma Interface Funcional, apenas 1 argumento, são equivalentes

        Comparator<String> comparador = Comparator.comparing(funcao); //comparing gera um Comparator com a function de argumento

        palavras.sort(comparador); //que é passado para o sort de palavras

        palavras.sort(Comparator.comparingInt(String::length)); //substituido por method references

        System.out.println(palavras);

        //Java 7
//        for (String string : palavras) {
//            System.out.println(string);
//        }

        //Java 8
        palavras.forEach(s -> System.out.println(s)); //dada uma string, ele consume uma string
        palavras.forEach(System.out::println); //Usando com Method Reference, é equivalente - dada uma string, ele consume uma string


        new Thread(() -> System.out.println("Executando um Runnable")).start();


    }
}

//class ComparadorPorTamanho implements Comparator<String> {
//
//    @Override
//    public int compare(String s1, String s2) {
//        if (s1.length() < s2.length()) {
//            return -1;
//        }
//
//        if (s1.length() > s2.length()) {
//            return 1;
//        }
//
//        return 0;
//    }
//}

