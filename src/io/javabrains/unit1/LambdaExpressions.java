package io.javabrains.unit1;

import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class LambdaExpressions {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting("Hello mother");
        Greeting lambdaGreeting = () -> System.out.println("Hello Madness");
        Greeting lambda = () -> System.out.printf("Lambda practice");

        Greeting anonymousInnerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("anonymous inner class");
            }
        };

//        helloWorldGreeting.perform();
//        lambdaGreeting.perform();
//        anonymousInnerClassGreeting.perform();

        //passing behavior as an argument
        greeter.greet(helloWorldGreeting);
        greeter.greet(lambdaGreeting);
        greeter.greet(anonymousInnerClassGreeting);

//        doubleNumberFunction = (int a) -> a * 2;
//
//        addFunction = (int a, int b) -> a + b;
//
//        safeDivideFunction = (int a, int b) -> {
//            if (b == 0) return 0;
//            return a / b;
//        };
//
//        stringLenghtCount = (String s) -> s.length();
//        int a = 5, b = 6;

        //passando o comportamento para uma operação matemática
        IntBinaryOperator soma = (int a, int b) -> a + b;
        MyCalc somaMyCalc = (int a, int b) -> a + b;
        IntBinaryOperator resta = (int a, int b) -> a - b;
        IntBinaryOperator multiplica = (int a, int b) -> a * b;
        IntBinaryOperator divide = (int a, int b) -> a / b;
        IntBinaryOperator safeDivide = (int a, int b) -> { //pra ñ dividir por zero
            if (b == 0) return 0;
            return a / b;
        };

//        soma.applyAsInt(3,5);
//        System.out.println(soma.);
        System.out.println(greeter.calculate(soma, 5, 6));
        System.out.println(greeter.calculateWithMyCalc(somaMyCalc, 5, 6));
        System.out.println(greeter.calculate(resta, 5, 6));
        System.out.println(greeter.calculate(multiplica, 5, 6));
//        System.out.println(greeter.calculate(divide, 5, 0));
        System.out.println(greeter.calculate(safeDivide, 5, 0));

        //contando os caracteres
        ToIntFunction<String> stringIntegerFunction = (String s) -> s.length();
        MinhasStrings comInterfacePropria = (String s) -> s.length();

        System.out.println(stringIntegerFunction.applyAsInt("Igor"));
        System.out.println(comInterfacePropria.executarRetornaInt("Avancini"));
        System.out.println(greeter.intFromString(comInterfacePropria, "Avancini"));

    }
}

interface MinhasStrings {
//    void hello();
    int executarRetornaInt(String s);
}

interface MyCalc {
    int calc(int a, int b);
}
