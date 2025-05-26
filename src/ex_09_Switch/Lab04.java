//Factorial Program

package ex_09_Switch;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=scanner.nextInt();

        int fact=1;

        for (int i=1; i<=n; i++){
            fact=fact*i;
    }
        System.out.println(fact);

        if(n==0){
            fact=1;
        }

        if(n>Integer.MAX_VALUE){
            System.out.println("No too large,cannot handle");
        }
    }
}
