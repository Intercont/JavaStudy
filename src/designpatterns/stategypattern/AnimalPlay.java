package designpatterns.stategypattern;

public class AnimalPlay {
    public static void main(String[] args) {
        Animal enzo = new Dog();
        Animal piupiu = new Bird();

        //let's check if they fly
        System.out.println("Dog: " + enzo.tryToFly());
        System.out.println("Bird: " + piupiu.tryToFly());

        //let's make our puppy being able to fly high
        enzo.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + enzo.tryToFly());
    }
}
