package day23_encapsulation_inheritance;

public class C03_encapsuleClassRunner {
    public static void main(String[] args) {
        C02_encapsuleClass obj=new C02_encapsuleClass();
        obj.strDefault="Default";
        System.out.println(obj.strProtected);
        obj.strPublic="adem";
        System.out.println(obj.getTotalSalesAmount());

        obj.setSalesAmount(100);
        obj.setSalesAmount(150);
        obj.setSalesAmount(250);

        System.out.println(obj.getTotalSalesAmount());
    }
}
