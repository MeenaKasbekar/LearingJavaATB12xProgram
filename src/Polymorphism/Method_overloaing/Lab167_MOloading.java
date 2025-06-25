package Polymorphism.Method_overloaing;

public class Lab167_MOloading {
    public static void main(String[] args) {

       MathOperations m1 =new MathOperations();
       int a1 = m1.add(2,3);
        System.out.println(a1);

       int a2=m1.add(2,3,4);
        System.out.println(a2);

        int a3=m1.add(10,20);
        System.out.println(a3);

        }
    }

