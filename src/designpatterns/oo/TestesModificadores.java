package designpatterns.oo;

public class TestesModificadores {
    public static void main(String[] args) {
        int num = 10;
        alteraNumero(num);
        System.out.println("numero primitivo depois da chamada de alteração: "+ num);

        Integer numObject = 16;
        alteraNumeroObject(numObject);
        System.out.println("numero objeto depois da chamada de alteração: "+ numObject);

    }

    private static void alteraNumeroObject(Integer numObject) {
        numObject = 89;
        System.out.println("no metodo: " + numObject);
    }

    private static void alteraNumero(int num) {
        num = 29;
        System.out.println("no metodo: " + num);
    }
}
