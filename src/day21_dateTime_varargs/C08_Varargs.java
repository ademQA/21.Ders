package day21_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {
// verilen degisken sayidaki tamsayidan
        // ilkinin karesini, digerlerinin toplamiyla carpan ve sonucu yazdiran bir method olusturun
        takeAction(3,4,5); // (3*3) * (4+5) = 81
        takeAction(2,3,4,5); // (2*2) *(3+4+5) = 48
        takeAction(4,5,6,7,8,9,0);
        takeAction(1,2); // Istenen islem sonucu : 2
        takeAction(5); // Istenen islem sonucu : 0
        // varargs degisken sayida element kabul edebilen bir array oldugundan
        // 12.satirda yazilan islemde varargs eleman kalmaz, varargs =[] bos bir array olur
    }
    public static void takeAction(int firstNumber, int... otherNumbers){
        int total = 0;
        for (int each:otherNumbers
        ) {
            total += each;
        }
        System.out.println("Istenen islem sonucu : " + (firstNumber*firstNumber*total));
    }
}
