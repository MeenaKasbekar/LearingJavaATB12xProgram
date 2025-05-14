package ex_02_Java_Basics_Part2;

public class Lab011_Local_variables {
    public static void main(String[] args) {

        byte age=100; //local variable can be accessible only with in the methods or function
        System.out.println(age);

        main(0);//if you want to call both the methods
        //if main(0) is not specified JVM will call only the first main function
    }

    public static void main (int args) {

        byte age=120;
        System.out.println(age);
    }
}
