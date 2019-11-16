package designpatterns.oo;

public class Dog extends Animal {

    public Dog() {
        super();
        setSound("Bark");
    }

    public void digHole() {
        System.out.println("Dug a Hole!");
    }

    public void changeVar(int randNum) {
        randNum = 12;
        System.out.println("randNum in method: " + randNum);
    }

    public void changeDogNameWithoutStatic(Dog dog, String name) {
        dog.setName(name);
        System.out.println("inside without static " + dog.getName());
    }

    private void privateMethod() {
        System.out.println("In a private method");
    }

    public void accessPrivate() {
        privateMethod();
    }

}
