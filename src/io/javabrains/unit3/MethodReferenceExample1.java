package io.javabrains.unit3;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
//        Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReferenceExample1::printMessage);//() -> method() //substituiu o lambda acima por Method Reference
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }

}