package Object_Oriented_Programming.Encapsulation;

public class Lab02 {
    public static void main(String[] args) {
        HDFCBank h1=new HDFCBank("Meena", 100);
        System.out.println(h1.getBalance());

        h1.setBalance(1000,false);
        System.out.println(h1.getBalance());
        System.out.println(h1.getName());
        System.out.println(h1.BankName);

    }
}

class HDFCBank {
    private String name;
    private long balance;
    public String BankName = "HDFCBank";

    public HDFCBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if (isCashier) {
            this.balance = balance;
        } else {
            System.out.println("Not Allowed");
        }
    }
}