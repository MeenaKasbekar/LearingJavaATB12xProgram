package Tasks;

import java.util.Scanner;

public class Task_Factorial {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scanner.nextInt();

        int fact=1;

        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("Factorial is: " +fact);
    }
}
