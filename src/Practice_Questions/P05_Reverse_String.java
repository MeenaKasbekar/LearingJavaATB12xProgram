package Practice_Questions;

import java.util.Scanner;

public class P05_Reverse_String {
    //Reverse a string without using reverse function

    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.print("Original String: ");
        String str=s1.next();

        String revstr=" ";
        for(int i=str.length()-1;i>=0;i--){
            revstr=revstr+str.charAt(i);

        }
        System.out.print("Reversed String:" +revstr);
    }
}
