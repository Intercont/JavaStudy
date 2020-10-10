package io.javabrains.unit1;

public class HelloWorldGreeting implements Greeting {

    String greeting;

    public HelloWorldGreeting(String value) {
        this.greeting = value;
    }

    @Override
    public void perform() {
        System.out.println(this.greeting);
    }
}
