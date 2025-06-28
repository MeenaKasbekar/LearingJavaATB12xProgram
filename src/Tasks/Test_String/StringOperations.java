package Tasks.Test_String;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Declaration
        String str1 = "Hello";
        String str2 = "hello";
        String str3 ="Hello";

        //equals
        System.out.println(str1.equals(str2));

        //equalsignorecase
        System.out.println(str1.equalsIgnoreCase(str2));

        //compare to
        System.out.println(str1.compareTo(str2));

    }
}


