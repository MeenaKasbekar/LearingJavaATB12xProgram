package Tasks.Basic_If_Else;

import java.util.Scanner;

public class Small_3_no {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter First Number");
        int num1=scanner.nextInt();

        System.out.print("Enter Second Number");
        int num2=scanner.nextInt();

        System.out.print("Enter Third Number");
        int num3=scanner.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println("Smaller Number " +num1);
        } else if (num2<num1 && num2<num3) {
            System.out.println("Smaller Number " +num2);
        }
        else {
            System.out.println("Smaller Number " +num3);
        }

    }
}
