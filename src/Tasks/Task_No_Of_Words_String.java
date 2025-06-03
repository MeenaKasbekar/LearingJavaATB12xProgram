package Tasks;

public class Task_No_Of_Words_String {
    public static void main(String[] args) {

        String str="Hello World! Welcome Meena";
        String [] words=str.split("\\s+");

        System.out.println("Number of words =" +words.length);
    }
}
