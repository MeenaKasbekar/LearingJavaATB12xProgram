package Tasks.Basic_If_Else;

import java.util.Scanner;

public class Grade_System {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks= scanner.nextInt();

        if(marks >0 && marks<=100){
            if(marks>90 && marks<100){
                System.out.println("A+");
            } else if (marks>80 && marks<89) {
                System.out.println("A");

            } else if (marks>70 && marks<79) {
                System.out.println("B");

            } else if (marks>60 && marks<69) {
                System.out.println("C");

            } else if (marks>50 && marks<59) {
                System.out.println("D");

            } else if (marks>40 && marks<49) {
                System.out.println("E");
            }else {
                System.out.println("fail");
            }
        }else {
            System.out.println("Please enter valid marks");
        }
    }
}
