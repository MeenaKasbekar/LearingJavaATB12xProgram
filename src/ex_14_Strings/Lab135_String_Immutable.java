package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {

      String s1="Meena";
      s1=s1.toUpperCase();
        System.out.println(s1);

        String s2="Kasbekar";
        s2.toUpperCase();  // string is immutable in nature
        System.out.println(s2);
    }
}
