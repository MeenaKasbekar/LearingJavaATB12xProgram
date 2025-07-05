package Test_Java_Wrapper;

    // Custom exception class
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class Custom_Exception_Example {

        // Method to check age
        public static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18 or older");
            }
            System.out.println("valid age: " + age);
        }

        public static void main(String[] args) {
            try {
                checkAge(16);  // This will throw the exception
            } catch (InvalidAgeException e) {
                System.out.println("InvalidAgeException: " + e.getMessage());
            }

            try {
                checkAge(20);  // This will pass
            } catch (InvalidAgeException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }


