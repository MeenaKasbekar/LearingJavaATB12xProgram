package Tasks.Basic_If_Else;

import java.util.Scanner;

public class Positive_Negative_no {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num=scanner.nextInt();

        if(num>0){
            System.out.println(+num +" is positive");
        }else {
            System.out.println(num +" is negative");
        }
    }
}
