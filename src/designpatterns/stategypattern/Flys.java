package designpatterns.stategypattern;

/**
 * This kind of approach is know as decoupling
 * Decoupling is know as the concept of encapsulating the behavior that changes
 * And in this case, this behavior is the  one that defines if it flyes or not
 */
public interface Flys {

    String fly();
}

class ItFlys implements Flys {

    @Override
    public String fly() {
        return "Flying High";
    }
}

class CantFly implements Flys {

    @Override
    public String fly() {
        return "I Can't Fly";
    }
}
