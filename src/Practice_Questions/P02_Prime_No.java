package Practice_Questions;

import java.util.Scanner;

public class P02_Prime_No {
    public static void main(String[] args) {

        Scanner s1 =new Scanner(System.in);
        System.out.println("Enter a number");
        int a= s1.nextInt();

        if(a%2==0){
            System.out.println("Prime No");
        }
        else {
            System.out.println("Not a Prime No");
        }

    }
}
