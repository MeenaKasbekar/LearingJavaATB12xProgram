package Tasks.Basic_While_loop;

public class Task4 {
    //Calculate sum of first 10 natural numbers

    public static void main(String[] args) {
        int sum =0;
        int i=1;
        while (i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
