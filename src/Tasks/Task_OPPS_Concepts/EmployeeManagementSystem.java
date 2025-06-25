package Tasks.Task_OPPS_Concepts;

import javax.print.attribute.standard.MediaSize;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        TeamLead T1=new TeamLead("XYZ",123, "Engineering");

        T1.work();
        T1.work(10);
        T1.getDepartment();

        T1.showInfo();

        System.out.println(T1.getName());

    }
}

//Base class
class Employee{
    private String name;
    private int Emp_id;

    //Constructor
    public Employee(String name, int Emp_id){
        this.name=name;
        this.Emp_id=Emp_id;
    }

    //Encapsulation: Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    //Method overloading
    public void work(){
        System.out.println("Employee is Working");
    }
    public void work(int hours){
        System.out.println("Employee worked for: " +hours+"hours");
    }
    public void showInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + Emp_id);
    }
}

// Subclass
class TeamLead extends Employee{
    private String department;

    public TeamLead(String name, int Emp_id, String department){
        super(name,Emp_id);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Department: " + this.department);
    }


    public void work(String task) {
        System.out.println("Manager is working on: " + task);
    }
}