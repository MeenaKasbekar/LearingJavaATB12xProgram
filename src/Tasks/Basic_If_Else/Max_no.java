package Tasks.Basic_If_Else;

import java.util.Scanner;

public class Max_no {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter First Number");
        int num1=scanner.nextInt();

        System.out.print("Enter Second Number");
        int num2=scanner.nextInt();

        if(num1>num2){
            System.out.println("Maximum Number " +num1);
        }else {
            System.out.println("Maximum Number " +num2);
        }

    }
}
