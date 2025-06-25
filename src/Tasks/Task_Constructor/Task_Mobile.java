package Tasks.Task_Constructor;

public class Task_Mobile {
    public static void main(String[] args) {
        mobile m1=new mobile("OnePlus", 30000);
        mobile m2=new mobile("Apple");

        m1.display();
        m2.display();
    }
}

class mobile{
    String brand;
    int price;

    public mobile(String brand) {
        this.brand = brand;
    }

    public mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void display(){
        System.out.println("Mobile Brand: "+brand);
        System.out.println("Mobile Price: "+price);
    }
}