package day18_constructors_With_Parametre_ConsructerCall;

public class C02_HospitalRunner {
    public static void main(String[] args) {
        C01_Hospital per1 = new C01_Hospital(); //parameterless constructor
        System.out.println(per1); //C07_Hastane Objesi==> personelIsmi:'no name specified', personelAdresi:'no Adres specified', personelTelefon:'no phone specified', personelTuru:'no staff type specified'
        per1.staffName="Sevda";
        per1.staffAdres="Ankara";
        per1.staffPhoneNumber="5552344323";
        per1.staffType="Nurse";
        System.out.println(per1);//C07_Hastane Objesi==> personelIsmi:'Sevda', personelAdresi:'Ankara', personelTelefon:'5552344323', personelTuru:'Nurse'
        // Bir obje olusturuldugunda o objenin ozelliklerini atama yapmazsak
        // class'daki ilk degerleri alacaktir
        // eger o objenin kendine ozgu degerleri olmasini istiyorsak
        // ATAMA yapmaliyiz
        C01_Hospital per2 = new C01_Hospital("Adem","Cankaya","5554323232","Doctor");
        System.out.println(per2); //C07_Hastane Objesi==> personelIsmi:'Adem', personelAdresi:'Cankaya', personelTelefon:'5554323232', personelTuru:'Doctor'
        C01_Hospital per3= new C01_Hospital("Murat","Sincan","5322318778","Doctor");
        System.out.println(per3); //C07_Hastane Objesi==> personelIsmi:'Murat', personelAdresi:'Sincan', personelTelefon:'5322318778', personelTuru:'Doctor'
    }
}

