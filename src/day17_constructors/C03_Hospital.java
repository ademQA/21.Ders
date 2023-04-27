package day17_constructors;

public class C03_Hospital {
    static String hospitalName= "Yildiz Hospital";
    static String hospitalPhoneNumber= "03123454545";
    String staffName= "no name specified";
    String staffAdres="no Adres specified";
    String staffPhoneNumber="no phone specified";
    String staffType="no staff type specified";
    public int wage(String staffType){
        switch (staffType){
            case "Doctor" :
                return 5000;
            case "Nurse" :
                return 3000;
            case "head Nurse" :
                return 4000;
            default:
                return 1900;
        }
    }
}
