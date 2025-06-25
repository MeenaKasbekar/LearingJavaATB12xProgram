package Tasks.Task_Constructor;

public class Task_Student {
    public static void main(String[] args) {

        Student s1=new Student("Meena Kasbekar", 24);
        s1.Display();
    }
}

class Student{
    String name;
    int age;

    //Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Display(){

        System.out.println("Student Name= " +name);
        System.out.println("Student Age= " +age);

    }
}