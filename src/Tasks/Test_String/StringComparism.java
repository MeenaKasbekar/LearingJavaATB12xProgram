package Tasks.Test_String;

public class StringComparism {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";

        // 1. Using == operator (reference comparison)
        System.out.println("== comparison (str1 == str2): " + (str1 == str2));
        System.out.println("== comparison (str1 == str3): " + (str1 == str3));

        // 2. Using equals() method (case-sensitive content comparison)
        System.out.println("equals() comparison (str1.equals(str2)): " + str1.equals(str2));
        System.out.println("equals() comparison (str1.equals(str4)): " + str1.equals(str4));

        // 3. Using equalsIgnoreCase() method
        System.out.println("equalsIgnoreCase() (str1.equalsIgnoreCase(str4)): " + str1.equalsIgnoreCase(str4));

        // 4. Using compareTo() method
        System.out.println("compareTo() (str1.compareTo(str2)): " + str1.compareTo(str2));
        System.out.println("compareTo() (str1.compareTo(str4)): " + str1.compareTo(str4));

        // 5. Using compareToIgnoreCase()
        System.out.println("compareToIgnoreCase() (str1.compareToIgnoreCase(str4)): " + str1.compareToIgnoreCase(str4)); // 0
    }
}
