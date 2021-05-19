package linkedintests;

public class Q62 {
//    public static void main(String[] args) {
//        int x=5,y=10;
//        swapsies(x,y);
//        System.out.println(x+"="+y); //ele não altera nada dentro de swapsies, apenas em objetos via setters do objeto, por atribuição assim não funciona
//    }
//
//    static void swapsies(int a, int b) {
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a + " " + b);
//    }

    ////////////////////Example based on the case above
//    public static void main(String[] args) {
//        Dog aDog = new Dog("Max");
//        Dog oldDog = aDog;
//
//        // we pass the object to foo
//        foo(aDog);
//        // aDog variable is still pointing to the "Max" dog when foo(...) returns
//        System.out.println(aDog.getName().equals("Max")); // true
//        System.out.println(aDog.getName().equals("Fifi")); // false
//        System.out.println(aDog == oldDog ? true : false); //true
//    }
//
//    public static void foo(Dog d) {
//        d.getName().equals("Max"); // true
//        // change d inside of foo() to point to a new Dog instance "Fifi"
//        d = new Dog("Fifi");
//        d.getName().equals("Fifi"); // true
//    }

    ////////////
    ///How would have worked for changing the name of the dog and have it inside of Main?? is Change the value of the passed object, not changing the object
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        foo(aDog);
        // when foo(...) returns, the name of the dog has been changed to "Fifi"
        System.out.println(aDog.getName().equals("Fifi")); // true
        // but it is still the same dog:
        System.out.println(aDog == oldDog ? true : false); //true // true
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // this changes the name of d to be "Fifi"
        d.setName("Fifi");
    }




}

class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




