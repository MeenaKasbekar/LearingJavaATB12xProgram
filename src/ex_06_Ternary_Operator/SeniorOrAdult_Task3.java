package ex_06_Ternary_Operator;

public class SeniorOrAdult_Task3 {
    public static void main(String[] args) {

        int age=28;
        String result=(age>65 ? "Senior" : (age< 18 ? "Minor" : "Adult"));
        System.out.println(result);
    }
}
