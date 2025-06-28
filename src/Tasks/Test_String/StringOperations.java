package Tasks.Test_String;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Declaration
        String firstName = "Meena";
        String lastName = "Kasbekar";

        // 2. Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // 3. Length of the string
        int length = fullName.length();
        System.out.println("Length: " + length);

        // 4. Substring
        String sub = fullName.substring(0, 8);
        System.out.println("Substring " + sub);

        // 5. Character extraction
        char initial = fullName.charAt(0);
        System.out.println("First character: " + initial);

        // 6. Last character
        char lastChar = fullName.charAt(fullName.length() - 1);
        System.out.println("Last character: " + lastChar);
    }
}


