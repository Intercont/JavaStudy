package linkedintests;

public class Q48 {
//    int age;
    static int age; //preciso transformar age em estático
    public static void main(String[] args) {
        System.out.println("Your age is: " + age); //não se pode referenciar um valor não estático de um método estático, como main
    }
}
