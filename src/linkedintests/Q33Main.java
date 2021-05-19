package linkedintests;

public class Q33Main {
    Object message() {
        return "Hello!";
    }

    public static void main(String[] args) {
        System.out.print(new Q33Main().message());
        System.out.print(new Main2().message());
    }
}
class Main2 extends Q33Main {
    String message() { //Sobrescreve message da Main, caso não tenha este método, as duas chamadas vão chamar de main, e printar Hello!Hello!
        return "World!"; //Porém, como existe esta sobrescrita em Main2, ao chamar message por Main2, o polimorfismo entra em ação, e este método é chamado
                        //Printando Hello!World! no lugar
    }
}
