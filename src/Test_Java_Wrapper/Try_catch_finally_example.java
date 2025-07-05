package Test_Java_Wrapper;

import java.util.Scanner;

public class Try_catch_finally_example {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        int result = 0;

        try {
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
