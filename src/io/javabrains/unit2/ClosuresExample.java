package io.javabrains.unit2;

public class ClosuresExample {

    public static void main(String[] args) {
       int a = 10;
       int b = 20; //b aqui é o Closure pois é um valor final esperado pela expressão lambda, o compiler "congela" seu valor no Java 8, não há a necessidade de colocar final mas seu comportamento é como se estivesse com o final declarado
       doProcess(a, i -> System.out.println(i + b));//o valor de b vem do Closure e não pode ser alterado
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
