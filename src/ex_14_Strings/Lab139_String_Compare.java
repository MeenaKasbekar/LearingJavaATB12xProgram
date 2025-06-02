package ex_14_Strings;

public class Lab139_String_Compare {
    public static void main(String[] args) {

        //String constant pool
        String s1="Meena";
        String s2="Meena";


        //Object Area
        String s3=new String("Meena");
        String s4=new String("Meena");
        String s5=new String("Meena");


        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
    }
}
