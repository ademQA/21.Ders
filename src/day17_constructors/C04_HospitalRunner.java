package day17_constructors;

public class C04_HospitalRunner {
    public static void main(String[] args) {
        /*
        Biz bir obje olusturdugumuzda java once bu constructor'un varligini teyit eder.
        Constructor varsa istenen objeyi olusturur.
        Obje olusturulunca instance olan butun variable'larin birer kopyalarini olusturur
        ve bu objeye iliskilendirir
        Objeye yeni bir atama yapmadigimiz muddetce
        objenin olusturuldugu class'daki ilk degerleri kullanir.

        obje uzerinden static variable'lara ulasmak istedigimizde
        java once obje'ye gider, o objeye ilisiklendirilen bilgilerde
        istenen variable'i bulamazsa, class seviyesinde static variable'lara ulasir

        static variable'lar class'a baglidir
        ve degistirilirse tum objeler icin degisiklik gecerli olur

         */
        C03_Hospital per1 = new C03_Hospital();
        System.out.println(per1.staffName); //no name specified
        per1.staffType="Doctor";
        System.out.println(per1.wage("Doctor"));//5000
        C03_Hospital per2= new C03_Hospital();
        System.out.println(per2.staffType); //no staff type specified
        System.out.println(per1.hospitalName); //Yildiz Hospital
        per2.hospitalName="Java Hospital";
        System.out.println(per1.hospitalName); //Java Hospital
    }
}
