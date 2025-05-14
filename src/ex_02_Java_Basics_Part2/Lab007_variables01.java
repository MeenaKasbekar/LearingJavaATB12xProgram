package ex_02_Java_Basics_Part2;

public class Lab007_variables01 {
    public static void main(String[] args) {

        int a=65;
        a=65+1;
        System.out.printf("Value of a = %d\n",a);

        int b=65;
        b=65+1;
        b=65; //In this case it will override the value of b and consider the latest declared value
        System.out.printf("Value of b = %d",b);

    }
}
