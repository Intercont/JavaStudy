package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        } catch (InputMismatchException e) {
            if(e.toString().contains(": ")) {
                System.out.println(e.toString().substring(0, e.toString().indexOf(": ")));
            } else {
                System.out.println(e);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
