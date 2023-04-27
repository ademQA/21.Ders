package day20_passByValue_immutableClasses;

public class C01_passByValue {
    public static void main(String[] args) {
        int number = 20;
        number= method2(number);
        System.out.println("Number after method2 call: " + number);
        System.out.println("Number as a result of method call: "+method1(number));
        System.out.println("Number after method call: " + number);
    }
    public static int method2(int number){
        number = 25;
        System.out.println("number in method2 : " + number);
        return number;
    }
    public static int method1(int number){
        number = 25;
        System.out.println("Number in Method1:" + number);
        return number;
    }
    }

