package day19_staticKeyWords_passByValue;

public class C04_notstaticBlok {
    public static void main(String[] args) {
        System.out.println("main method worked");
        C04_notstaticBlok obj1=new C04_notstaticBlok();
        C04_notstaticBlok obj2=new C04_notstaticBlok();
        C04_notstaticBlok obj3=new C04_notstaticBlok();


    }
    static {
        System.out.println("static blok worked");
    }
    {
        System.out.println("not static blok worked");
    }
}
