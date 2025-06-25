package Tasks.Task_Constructor;

public class Task_Car {
    public static void main(String[] args) {

        Car c1= new Car("Tata","Nexon",1500000);
        c1.details();

    }
}

class Car {
    String brand;
    String model;
    int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void details(){
        System.out.println("Car brand= " +brand);
        System.out.println("Car model= " +model);
        System.out.println("Car price= " +price);
    }
}




