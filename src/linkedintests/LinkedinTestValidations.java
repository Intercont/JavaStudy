//package linkedintests;
//
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.util.*;
//import java.util.stream.Collectors;
//
//import linkedintests.mypackagelinkedintests.Math;
////import linkedintests.mypackagelinkedintests.elementary.*;
//
//public class LinkedinTestValidations implements One, Two {
//    public void method() {
//        //Q9
//        System.out.println("Q9");
//        One.super.method(); //right answer!!
//    }
//
//    public static void main(String[] args) {
//        //Q7
//        System.out.println("Q7");
//        String str = "abcde";
//        String alterada = str;
//        str.trim();
//        alterada = alterada.trim();
//        System.out.println("Alterada: " + alterada);
//        alterada = alterada.toUpperCase();
//        str.toUpperCase();
//        System.out.println("Alterada: " + alterada);
//        str.substring(3, 4);
//        alterada = alterada.substring(3, 4);
//        System.out.println("Alterada: " + alterada);
//        System.out.println("Original: " + str);
//////////////////////////////////////////////////////////////////////
//        //Q3
//        System.out.println("Q3");
//        boolean b1 = true, b2 = false;
//        int i1 = 1, i2 = 2;
//
//
//        System.out.println((i1 | i2) == 3);
////        System.out.println(i2 && b1); //resposta correta, nem compila muito menos retornar false
//        System.out.println(b1 || !b2);
//        System.out.println((i1 ^ i2) < 4);
///////////////////////////////////////////////////////////////////////
//        //Q5
//        System.out.println("Q5");
//        int array[] = {1, 2, 3, 4};
////         for (int i = 0; i < array.size(); i++) { //não existe o método size e sim a propriedade lenght em array
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
//
////////////////////////////////////////
//        //Q6
//        System.out.println("Q6");
//        System.out.println();
//        System.out.print("Hello ");
//        Two.print();
/////////////////////////////////////////
//        //Q8
//        System.out.println("Q8");
//        System.out.println(print(1)); //ele printa lindamente escrito "java.lang.Exception" e mais nada, pois não está sendo throw, e sim, retornado o objeto Exception
//
//        //Q10
//        System.out.println("Q10");
//        List list = new ArrayList();
//        list.add("hello");
//        list.add(2);
//        System.out.print(list.get(0) instanceof Object);
//        System.out.print(list.get(1) instanceof Integer);
//
//        //Q11
//        System.out.println("Q11");
//        System.out.println(Math.abs(123)); //irá considerar apenas o import direto à classe pois pelo wildcard conflita com a classe Math, de Java.util, por isso a resposta é "123"
//
//
//        //Q13
//        System.out.println("Q13 - Args da aplicação");
////        System.out.println(args[2]); ver classe Q13ArgsOutput
//
//        //Q14
//        System.out.println("Q14");
////        int i = 123451234512345; //número não cabe em um int
////        System.out.println(i);
//
//        //Q15
//        System.out.println("Q15");
//        String message = "Hello world!";
//        String newMessage = message.substring(6, 12)
//                + message.substring(12, 6); //StringIndexOutOfBounds
//        System.out.println(newMessage);
//
//        //Q19
//        System.out.println("Q19");
//        System.out.println("apple".compareTo("banana"));
//        System.out.println("aa".compareTo("aaa"));//se forem iguais as string, ele faz uma conta matemática, neste exemplo 2 - 3 = -1
//        //se forem diferentes, ele vai buscar no índice a que estiver diferente e calcula a diferença entre elas
//        System.out.println("aadef".compareTo("aai")); //neste caso, i está 5 posições a frente de d no index 2, posição de d como zero - 5 de i = -5
//        System.out.println("aadef".compareTo("aag")); //neste caso, g está 3 posições a frente de d no index 2, posição de d como zero - 3 de g = -3
//        System.out.println("aag".compareTo("aadef")); //neste caso, d está 3 posições atrás de g, então, para d chegar em g faltam +3
//
//        //Q20
//        System.out.println("Q20");
//        //You have an ArrayList of names that you want to sort alphabetically. Which approach would NOT work?
//        List<String> names = new ArrayList<>();
//        names.add("Igor");
//        names.add("Bola");
//        names.add("Fina");
//
//        System.out.println("Printando lista original");
//        names.forEach(n -> System.out.println(n));
//
////        System.out.println("Organizando a lista: Opção A");
////        names.sort(Comparator.comparing(String::toString));
////        names.forEach(n -> System.out.println(n));
//
//        System.out.println("Organizando a lista: Opção B");
////        Collections.sort(names);
////        names.forEach(System.out::println);
//
//        System.out.println("Organizando a lista: Opção C - Correta, constante não existe dentro da Interface List");
////        names.sort(List.DESCENDING); //<<<--- Correct - ISSO NON ECXIXTE!
//
//        System.out.println("Organizando a lista: Opção D");
////        names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
//        names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList()).forEach(System.out::println);
//
//        //Q22
//        System.out.println("Q22");
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
//        System.out.println(new Date(System.currentTimeMillis()));
//        System.out.println(LocalDate.now()); //PRA MIM É ESSE CARA AQUI
//        System.out.println(Calendar.getInstance().getTime());
//
//        //Q23
//        System.out.println("Q23");
//        int int0 = 5;
//        boolean isDivisibleBy5 = int0 % 5 == 0;
//        System.out.println(isDivisibleBy5);
//
//        //Q24 - 10 times
//        for (int i=0; i<10; i=i++){ //aqui temos um pós incremento e uma atribuição, ele atribui primeiro o valor à i
//            // para depois incrementar seu valor, ou seja, de nada serve, pois o valor já foi atribuído.
//            // O único incremento que está contando é o do corpo do for, na linha abaixo
//            i+=1;
//            System.out.println("Hello World!");
//        }
//        //Q28
//        System.out.println("Q28");
//        LinkedList<Integer> listq28 = new LinkedList<>();
//        listq28.add(5);
//        listq28.add(1);
//        listq28.add(10);
//        System.out.println(listq28);
//
//        //Q29
////        System.out.println("Q29");
////        String message = "Hello";
////        for (int i = 0; i<message.length(); i++){
////            System.out.print(message.charAt(i+1));
////        }
//
//        //Q32
//        System.out.println("Q32");
//        List<Boolean> booleanList = new ArrayList<>();
//        booleanList.add(true);
//        booleanList.add(Boolean.parseBoolean("TrUe"));
//        booleanList.add(Boolean.TRUE);
//        System.out.print(booleanList.size());
//        System.out.print(booleanList.get(1) instanceof Boolean); //3true
//
//
//        //Q36
////        System.out.println("Q36");
////        try {
////            System.out.println("A");
//////            badMethod();
////            System.out.println("B");
////        } catch (Exception ex) {
////            System.out.println("C");
////        } finally {
////            System.out.println("D");
////        }
//
//        //Q38
//        System.out.println("Q38");
//        String[] arrayq38 = {"abc", "2", "10", "0"};
//        List<String> listq38 = Arrays.asList(arrayq38);
//        Collections.sort(listq38);
//        System.out.println(Arrays.toString(arrayq38));
//        //[0, 10, 2, abc] com base na ordem da tabela ascii https://pt.wikipedia.org/wiki/Ficheiro:ASCII-Table-wide.svg
//
//        //Q39
//        System.out.println("Q39");
//        String message = "Hello";
//        print(message);
//        message += "World!";
//        print(message);
//
//        //Q46
//        System.out.println("Q46");
//        char smooch = 'x';
//        System.out.println((int) smooch);
//
//        //Q55
////        System.out.println("Q55");
////        int a = 1;
////        int b = 0;
////        int c = a/b;
////        System.out.println(c);//ArithmeticException throw
//
//        //Q63
////        System.out.println("Q63");
////        try {
////            System.out.println("Hello World");
////        } catch (Exception e) { //Exception genérica SEMPRE deve ser a última a ser capturada, se coloco outros tipos de excessões embaixo dela, serão ignoradas
////            System.out.println("e");
////        }
////        catch (ArithmeticException e) {
////            System.out.println("e");
////        }finally {
////            System.out.println("!");
////        }
//
//
//
//
//
//
//
//    }
//
//    static void print(String message){
//        System.out.print(message);
//        message += " ";
//    }
//
//    public static void badMethod(){
//        throw new Error();
//    }
//
//    static Exception print ( int i) {
//        if (i > 0) {
//            return new Exception();
//        } else {
//            throw new RuntimeException();
//        }
//    }
//
//    String message() {
//        return "World";
//    }
//}