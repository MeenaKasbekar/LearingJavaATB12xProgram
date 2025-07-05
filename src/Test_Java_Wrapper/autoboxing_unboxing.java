package Test_Java_Wrapper;

public class autoboxing_unboxing {
    public static void main(String[] args) {
        // Autoboxing: converting primitive wrapper
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt;
        System.out.println("Autoboxed: " + wrappedInt);

        // Unboxing: converting wrapper to primitive
        Integer anotherWrappedInt = 10;
        int anotherPrimitiveInt = anotherWrappedInt;
        System.out.println("Unboxed: " + anotherPrimitiveInt);
        
    }
}
