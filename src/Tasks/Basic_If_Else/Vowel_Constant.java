package Tasks.Basic_If_Else;

import java.util.Scanner;

public class Vowel_Constant {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the letter: ");
        char c=scanner.next().charAt(0);

        if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
            System.out.println("Its Vowel");
        }else {
            System.out.println("its Constant");
        }
    }
}
