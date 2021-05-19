package linkedintests;

/*
In Java, non-static final variables can be assigned a value either in constructor or with the declaration.
But, static final variables cannot be assigned value in constructor; they must be assigned a value with their declaration.
 */
public class Q51Class {
    private final int x;

    public Q51Class() {
        x = 77; //C is the correct answer, NOT the D as the page says
//        setX(77);
    }

//    private void setX(int x) {
//        this.x = x;
//    }



    public static void main(String[] args) {

    }
}
