package day19_staticKeyWords_passByValue;

public class C06_PassByValue {
    public static void main(String[] args) {
        double price=200;
        System.out.println(discounMake(price));
        System.out.println("After the discount price is printed: "+price);
        price=discounMake(price);
        System.out.println("After the discount price is assigned: "+price);
        System.out.println(discounMake(500));
    }
    public static double discounMake(double prc){
        prc=prc*0.9;
        return prc;
    }
}
