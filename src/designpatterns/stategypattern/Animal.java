package designpatterns.stategypattern;

public class Animal {

    private String name;
    private int weight;
    private String sound;

    //Composition - instead of inheriting an ability through inheritance, the class is composed with objects with the
    //              right ability built-in. Also allows to change the capabilities of objects at runtime by passing a
    //              new object from that new behavior
    //We achieve this through instance variables from the interfaces that represents the expected set of abilities.
    // 1 - Always eliminate duplicated code
    // 2 - eliminate any tecniques that cause one class to affect others
    private Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be bigger than than 0");
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    //will return the method fly from the Flys interface with the values specific to each object
    public String tryToFly() {
        return flyingType.fly();
    }

    //with a setter, is possible to change the behavior of the object at runtime
    public void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }
}
