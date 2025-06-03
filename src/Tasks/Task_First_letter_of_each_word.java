package Tasks;

public class Task_First_letter_of_each_word {
    public static void main(String[] args) {

        String str="java programming is easy";
        String [] words=str.split(" ");

        for(String word:words){
            if(!word.isEmpty());
            System.out.print(word.charAt(0));
        }
    }
}
