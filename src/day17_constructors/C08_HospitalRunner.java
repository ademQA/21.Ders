package day17_constructors;

public class C08_HospitalRunner {
    public static void main(String[] args) {
        C07_Hospital per1 = new C07_Hospital();
        System.out.println("Ism : " + per1.staffName +
                ", adres : " + per1.staffAdres +
                ",Telefon : " + per1.staffPhoneNumber+
                ", personel turu : " + per1.staffType);
        System.out.println(per1);
        C07_Hospital per2 = new C07_Hospital("Selgun");
        System.out.println(per2);
    }
}
