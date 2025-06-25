package Object_Oriented_Programming.Encapsulation;

public class Lab01 {
    public static void main(String[] args) {
        ICICIBank b1=new ICICIBank(100, "Meena");
        System.out.println(b1.getBal());

        boolean isCashier= false;
        b1.setBal(1000,isCashier);
        System.out.println(b1.getBal());
        System.out.println(b1.getName());
        System.out.println(b1.BankName);

    }
}

class ICICIBank{
    private String name;
    private long bal;
    public String BankName ="ICICIBank";

    public ICICIBank(long bal, String name) {
        this.bal = bal;
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if(isCashier){
            this.bal = bal;
        }
        else {
            System.out.println("Not allowed to update the balance");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
