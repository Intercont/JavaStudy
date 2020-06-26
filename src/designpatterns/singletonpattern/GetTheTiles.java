package designpatterns.singletonpattern;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        SingletonScrabbleLetters newInstance = SingletonScrabbleLetters.getInstance();
        System.out.println("Instance1 ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList()); //mostrar a lista inteira
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player: " + playerOneTiles);
        System.out.println("Got Tiles!");
        System.out.println(newInstance.getLetterList()); //mostrar a lista inteira
    }
}
