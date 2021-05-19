//package linkedintests.q12;
//
//class MainClass {
//    final String message() {
//        return "Hello!";
//    }
//    public class Q12Main extends MainClass {
//        public static void main(String[] args) {
//            System.out.println(message());
//        }
//
//
//        String message() { //dois pontos nesse cara aqui:
//                            //1º: este método é inútil pois ele não sobrescreve o herdado, pois o mesmo é final e não aceita sobrecarga
//                            //2º o método herdado como final não é estático, não pode ser chamado diretamente de um contexto estático (como é o main)
//                            //por isso não compilará
//                            //como o problema acontece primeiro por conta de não poder realizar a sobrecarga sobre um método final, o erro está na linha 13 aqui, 10 na prova
//            return "World!";
//        }
//    }
//
//}
//
//
//
//
