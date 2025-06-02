package Tasks;

import java.util.Scanner;

public class Task_Fibonacci_series {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=scanner.nextInt();

        int a=0;
        int b=1;

        for(int i=1; i<=n; i++)
        {
            System.out.println(a+ "");
            
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
