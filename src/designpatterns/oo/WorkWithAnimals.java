package designpatterns.oo;

import java.util.ArrayList;
import java.util.List;

public class WorkWithAnimals {
    int numTest = 0;

    public static void main(String[] args) {
        Dog fide = new Dog();

        fide.setName("Fide");
        System.out.println(fide.getName());

        fide.digHole();

        fide.setWeight(-2);

        int randNum = 9;

        fide.changeVar(randNum);

        System.out.println("randNum value after method call " + randNum);

        changeDogNameWithStatic(fide, "lulu");
        fide.changeDogNameWithoutStatic(fide, "fifi");

        //Polimorfismo
        Animal doggy = new Dog();
        Animal kitty = new Cat();

        List<Animal> animals = new ArrayList<>();
        animals.add(doggy);
        animals.add(kitty);

        //for com Java 8
        animals.stream().map(animal -> animal.getSound()).forEach(System.out::println);

        //Java 7
        for (Animal animal : animals) {
            System.out.println(animal.getSound());
        }

        speakAnimal(doggy);
        speakAnimal(kitty);

        ((Dog) doggy).digHole();

        //blablabla(); //metodos nao estaticos nao podem ser chamados de dentro de metodos estáticos
        //System.out.println(numTest); //variáveis não estáticas não podem ser chamadas de dentro de métodos estáticos

        fide.accessPrivate();
    }

    private static void speakAnimal(Animal animal) {
        System.out.println("Animal says "+ animal.getSound());
    }


    public static void changeDogNameWithStatic(Dog dog, String name) {
        dog.setName(name);
        System.out.println("inside with static " +dog.getName());
    }

    public void blablabla(){
        speakAnimal(new Animal());
    }
}
