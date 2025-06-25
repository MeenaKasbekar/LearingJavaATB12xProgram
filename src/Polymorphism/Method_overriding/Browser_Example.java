package Polymorphism.Method_overriding;

public class Browser_Example {
    public static void main(String[] args) {
        TC t1=new TC();
        t1.OpenBrowser();

    }
}

class CommonToAll{
    void OpenBrowser(){
        System.out.println("Opening Chrome Browser");
    }
}


class TC extends CommonToAll{
    @Override
    void OpenBrowser(){
        System.out.println("Staring Chrome Browser");
    }
}
