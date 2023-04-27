package day17_constructors;

public class C06_HospitalRunner {
    public static void main(String[] args) {
        C05_Hospital per1 = new C05_Hospital();
        System.out.println(per1.staffName); // Isim belirtilmedi
        System.out.println(per1.staffPhoneNumber); // Telefon belirtilmedi
        System.out.println(per1.staffAdres); // Adres belirtilmedi
        System.out.println(per1.staffType); // Personel turu belirtilmedi
        System.out.println(per1.wage("clerk")); // 1900
        per1.staffName="Adem";
        per1.staffAdres="Cankaya";
        per1.staffPhoneNumber= "5553242132";
        per1.staffType="Doktor";
        System.out.println(per1.staffName); // Adem
        System.out.println(per1.staffPhoneNumber); // 5553242132
        System.out.println(per1.staffAdres); // Cankaya
        System.out.println(per1.staffType); // Doktor
        System.out.println(per1.wage("Doctor")); // 5000
    }
}
