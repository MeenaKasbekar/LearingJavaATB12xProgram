//program to check no of days in a month with leap year

package ex_09_Switch;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the month no from 1-12: ");
        int month= scanner.nextInt();

        System.out.println("Enter the year: ");
        int year= scanner.nextInt();

        switch (month){

            case 1,3,5,7,8,10,12:
            {
                System.out.println("This month has 31 Days");
                break;
            }
            case 4,6,9,11:
            {
                System.out.println("This month has 30 days");
                break;
            }
            case 2:
            {
                if (year % 4 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
                break;
            }

            default:{
                System.out.println("Invalid Input");
            }
        }
    }
}
