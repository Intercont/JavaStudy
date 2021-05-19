package linkedintests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q41 {
    public static void main(String[] args) {
        List<String> theList = new ArrayList<>();
        theList.add("Igor");
        theList.add("Bola");
        theList.add("Fina");

        //A
        for (int i = 0; i < theList.size(); i++) {
            System.out.println(theList.get(i));
        }

        //B
        for (Object object : theList) {
            System.out.println(object);
        }

        //C - RESPOSTA CERTA, ESTÁ ERRADO NO QUESTIONÁRIO - está usando for no lugar de um if, não vai funcionar NUNCA
//        Iterator it = theList.iterator();
//        for (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //D - este funciona NORMALMENTE
        theList.forEach(System.out::println);
    }
}
