package Test_Java_Wrapper;

public class Catch_Multiple_Exception {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int a = 10;
        int b = 0;

        try {
            // This will cause ArithmeticException (division by zero)
            int result = a / b;
            System.out.println("Result: " + result);

            // This will cause ArrayIndexOutOfBoundsException (index 5 out of bounds)
            System.out.println("Element: " + numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
