package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String s1="Meena";

        char a=s1.charAt(2); //will get the letter at that index
        System.out.println(a);
        System.out.println(s1.codePointAt(2)); //will give the ASCII value of the letter

        String s2="meena";
        int str=s1.compareTo(s2); //will give the difference of ASCII values
        int str1=s1.compareToIgnoreCase(s2);
        System.out.println(str);
        System.out.println(str1);

        int str2="java".indexOf("a");
        System.out.println(str2);
        int str3="java".lastIndexOf("a");
        System.out.println(str3);

        String str4=String.join("-","Java","Programming");
        System.out.println(str4);

        String str5="java".replace('o','m');
        System.out.println(str5);

        boolean b1="java".startsWith("ja");
        System.out.println(b1);

    }
}
