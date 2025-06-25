package Tasks.Basic_If_Else;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("No is Even");
        } else {
            System.out.println("No is Odd");
        }
    }
}