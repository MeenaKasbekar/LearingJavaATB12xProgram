//Grade System Program using switch case

package ex_09_Switch;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Letters from A,B,C,D,F: ");
        String grade=scanner.next();

        switch (grade){
            case "A":{
                System.out.println("Excellent");
                break;
            }
            case "C": {
                System.out.println("Good");
                break;
            }
            case "D": {
                System.out.println("Needs Improvement");
                break;
            }
            case "F": {
                System.out.println("Fail");
                break;
            }

            default:{
                System.out.println("Invalid grade");
            }

        }

    }
}
