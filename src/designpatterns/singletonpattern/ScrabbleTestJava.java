package designpatterns.singletonpattern;

import java.util.LinkedList;

public class ScrabbleTestJava {

    public static void main(String[] args) {
        //primeira instancia do Singleton
        SingletonScrabbleLetters newInstance = SingletonScrabbleLetters.getInstance();
        System.out.println("Instance1 ID: " + System.identityHashCode(newInstance));

        //printamos todas as letras que temos no jogo
        System.out.println(newInstance.getLetterList());

        //jogador numero 1 recebe 7 tiles, removemos da lista principal estes 7 tiles no metodo getTiles
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player 1 Tiles: " + playerOneTiles);

        //conferimos como ficou a lista de letras após o jogador 1 pegar susas 7 letras
        System.out.println(newInstance.getLetterList());

        ///SEGUNDA INSTANCIA
        SingletonScrabbleLetters secondInstance = SingletonScrabbleLetters.getInstance();
        System.out.println("Instance2 ID: " + System.identityHashCode(secondInstance));

        System.out.println(secondInstance.getLetterList());

        //jogador numero 2 recebe 7 tiles, removemos da lista principal estes 7 tiles no metodo getTiles
        LinkedList<String> playerTwoTiles = secondInstance.getTiles(7);
        System.out.println("Player 2 Tiles: " + playerTwoTiles);

        //conferimos como ficou a lista de letras após o jogador pegar susas 7 letras
        System.out.println(secondInstance.getLetterList());
    }
}
