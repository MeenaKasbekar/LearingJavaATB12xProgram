package ex_15_StringBuilder_StringBuffer;

public class L01_Reverse_String {
    public static void main(String[] args) {

      String s1="Kasbekar";

      //reverse a string without using inbuilt function

        for(int i= s1.length()-1; i>=0; i--)
        {
            System.out.print(s1.charAt(i));
        }
    }
}
