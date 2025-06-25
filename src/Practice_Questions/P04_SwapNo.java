package Practice_Questions;

import java.util.Scanner;

public class P04_SwapNo {
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.print("Enter first no a: ");
        int a= s1.nextInt();

        System.out.print("Enter Second no b: ");
        int b= s1.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a=" +a);
        System.out.println("b=" +b);
    }
}
