package Practice_Questions;

public class P01_String_Palindrome {

    public static void main(String[] args) {

        String str="Madam";

        String revstr=new StringBuffer(str).reverse().toString();
        if(str.equalsIgnoreCase(revstr)){
            System.out.println("Is a Palindrome");
        }
        else {
            System.out.println("Is not an Palindrome");
        }
    }
}
