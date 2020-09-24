package io.javabrains;

public class LambdaExpressions {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting("Hello mother");
        Greeting lambdaGreeting = () -> System.out.println("Hello Madness");

        Greeting anonymousInnerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("anonymous inner class");
            }
        };

//        helloWorldGreeting.perform();
//        lambdaGreeting.perform();
//        anonymousInnerClassGreeting.perform();

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


    }
}

interface ABlockOfCode {
    void hello();
}
