package designpatterns.singletonpattern;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class SingletonScrabbleLetters {

    private static SingletonScrabbleLetters firstInstance = null;

    //todas as letras do scrabble em um array
    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};

    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    private SingletonScrabbleLetters(){}

    public static SingletonScrabbleLetters getInstance() {
        if (firstInstance == null) {

            if(firstThread) {
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (SingletonScrabbleLetters.class) {
                if (firstInstance == null) {
                    firstInstance = new SingletonScrabbleLetters();
                    Collections.shuffle(firstInstance.letterList); //embaralhar as letras
                }
            }
        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<>();
        for (int i = 0; i < howManyTiles; i++) {
            tilesToSend.add(firstInstance.letterList.remove(0)); //remove da letterlist e adiciona na tilesToSend
        }
        return tilesToSend;
    }
}
