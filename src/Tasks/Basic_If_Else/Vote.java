package Tasks.Basic_If_Else;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age= scanner.nextInt();

        if(age>18){
            System.out.println("You can Vote!!");
        }else {
            System.out.println("Sorry Cannot Vote~");
        }
    }
}
