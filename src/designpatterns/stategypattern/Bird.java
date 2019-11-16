package designpatterns.stategypattern;

public class Bird extends Animal {

    public Bird() {
        super();
        setSound("Piupiu");
        setFlyingAbility(new ItFlys());
    }
}
