package Polymorphism.Method_overriding;

public class Lab175 {
    public static void main(String[] args) {

        Meena m1=new Meena();
        m1.home();
        m1.M1();

        Father f1=new Father();
        f1.home();
        f1.F1();

        Father f2=new Meena();
        f2.home();
        f2.F1();
    }


}
