package Practice_Questions;

import java.util.Scanner;

public class P03_Factorial_No {
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= s1.nextInt();

        int fact=1;
        for(int i=1;i<=a;i++)
         fact=fact*i;
        {
            System.out.println("Factorial is " +fact);
        }
    }
}
