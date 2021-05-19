package linkedintests;

interface One {
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method() {
        System.out.println("One");
    }
    static void print() {
        System.out.println("World!");
    }
}
