package Test_Java_Wrapper;

public class Generic_Swap_Method {
    // Generic method to swap elements at index i and j in array
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        System.out.println("Before swap: ");
        for (int n : numbers) System.out.print(n + " ");

        swap(numbers, 0, 2);

        System.out.println("\nAfter swap: ");
        for (int n : numbers) System.out.print(n + " ");
    }
}

