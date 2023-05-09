package day26_inheritanceDataTypeUsing;

public class C03_OverridingC extends C03_OverridingB{


    public void method1(){
        System.out.println("Overriding3 method1");
    }
    @Override
    public void method3() {
        super.method3();
    }
    /*
        Overriding method'u IntelliJ'e de olusturtabiliriz
        bu durumda IntelliJ 2 sey ekler
        1- @Override Annaotation
           kullanmak zorunda degiliz
           silerseniz CTE olmaz
           @Override notasyonu parent class'daki
           overridden method'u kontrol eder
           ve silinirse CTE verir
        2- super.method3()
           mecburi degildir,
           silerseniz CTE olmaz
           bir class'da hem overridden method hem overriding method CALISMAZ
           Eger en guncel method ile birlikte
           parent class'da gecersiz kilinan (overridden)
           method'un da calismasini isterseniz
           super.method3() kullanabilirsiniz
     */
    public static void main(String[] args) {

        C03_OverridingC obj1 = new C03_OverridingC();
        obj1.method1(); // OverridingC method1
        obj1.method2(); // OverridingB method2
        C03_OverridingB obj2 = new C03_OverridingB();
        obj2.method1(); // OverridingC method1
        obj2.method2(); // OverridingB method2
        C03_OverridingA obj3 = new C03_OverridingC();
        obj3.method1(); // OverridingC method1
        obj3.method2(); // OverridingB method2
        C03_OverridingA obj4 = new C03_OverridingA();
        obj4.method1(); // OverridingA method1
        obj4.method2(); // OverridingA method2
    }
}
