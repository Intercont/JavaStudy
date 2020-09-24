package io.javabrains;

public class TypeInferenceExample {
    public static void main(String[] args) {
        printLambda(s -> s.length(), "Igor");
    }

    public static void printLambda(StringLenghtLambda stringLenght, String value) {
        System.out.println(stringLenght.getLenght(value));
    }

    interface StringLenghtLambda {
        int getLenght(String s);
    }

}
