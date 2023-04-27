package day19_staticKeyWords_passByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        double price=200;
discountMake(price);
        System.out.println("After the discount price is printed:"+price);
    }
    public static void discountMake(double prc){
        prc=prc*0.9;
        System.out.println("10% discount price is:"+prc);

    }
}
