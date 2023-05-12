package day28_interface;

import day27_pollymorphism_abstractClasses.C04_Toyota;

public class C03_Childof_I01_I02 extends C04_Toyota implements I01_Interface,I02_Interface {
    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI);//20
        System.out.println(I02_Interface.SAYI);//30
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648
    }
    @Override
    public void method1() {

    }

    @Override
    public int methodd2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public double method4() {
        return 0;
    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }
}
