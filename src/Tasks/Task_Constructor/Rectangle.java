package Tasks.Task_Constructor;

public class Rectangle {
    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public void area(){
        int a=length*breath;
        System.out.println("Area of Rectangle= "+a);
    }

    public static void main(String[] args) {
        Rectangle R1=new Rectangle(10,10);
        R1.area();
    }
}
