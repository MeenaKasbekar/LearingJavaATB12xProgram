package ex_14_Strings;

public class Lab140_String_equals {
    public static void main(String[] args) {


        //String constant pool
        String s1="Meena";
        String s2="Meena";


        //Object Area
        String s3=new String("Meena");
        String s4=new String("Meena");
        String s5=new String("Meena");
        String s6=new String("meena");

        // equals function will compare the content in the string and not the area where it is store unlike ==
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(s6));
        System.out.println(s2.equalsIgnoreCase(s6));
    }
}

