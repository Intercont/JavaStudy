package io.javabrains.unit1;

import java.util.function.IntBinaryOperator;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public int calculate(IntBinaryOperator intBinaryOperator, int a, int b) {
        return intBinaryOperator.applyAsInt(a, b);
    }

    public int calculateWithMyCalc(MyCalc myCalc, int a, int b) {
        return myCalc.calc(a, b);
    }

    public int intFromString(MinhasStrings lambdaOQueFazer, String valorString) {
        return lambdaOQueFazer.executarRetornaInt(valorString);
    }
}
