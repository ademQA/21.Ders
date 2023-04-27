package day03_dataCasting_WrapperClasses;

public class C03_DataCastingExemple {
    public static void main(String[] args) {
        //Question1: Write a code that prints the average of 3 values given as Int as double.
        int in1=12;
        int in2=19;
        int in3=45;
        double average=(double) (in1+in2+in3)/3;
        System.out.println(average);
    }
}
