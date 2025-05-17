package ex_06_Ternary_Operator;

public class MaxOf3Nos_Task2 {
    public static void main(String[] args) {

        int x=100 , y=200, z=30;

        String result= (x>y)?((x>z)?"X is greater":"Z is greater"):((y>z)?"Y is greater":"Z is greater");
        System.out.println(result);
    }
}


