package Tasks;

import java.util.Scanner;

public class Task_Prime_Number {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=scanner.nextInt();

        if(n%2==0){
            System.out.println("No is prime");
        }
        else {
            System.out.println("No is not prime");
        }
    }
}
