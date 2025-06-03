package Tasks;

public class Task_String_Palindrome {
    public static void main(String[] args) {

        String str="Madam";

        String revstr=new StringBuffer(str).reverse().toString();
        if(str.equalsIgnoreCase(revstr))
        {
            System.out.println("Is a palindrome");
        }
        else {
            System.out.println("Is not a palindrome");
        }
    }
}
