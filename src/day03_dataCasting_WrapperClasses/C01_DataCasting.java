package day03_dataCasting_WrapperClasses;

public class C01_DataCasting {
    public static void main(String[] args) {

        byte byt=12;
        int int1=234;
        short shrt=46;
        long lng=456;

        float flt=3.5f;
        double dbl=345.67;

        boolean bln=true;
        char ch='s';

        lng=int1;
        int1=(int) lng;

        dbl=shrt;
        flt=byt;

        byt=(byte) int1;

    }
}
