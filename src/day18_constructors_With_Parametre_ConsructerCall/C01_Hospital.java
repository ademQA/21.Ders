package day18_constructors_With_Parametre_ConsructerCall;

public class C01_Hospital {
    public C01_Hospital(String isim){
        System.out.println("name parameter constructor");
    }
    public C01_Hospital(){
        System.out.println("parameterless constructor");
    }
    public C01_Hospital(String name, String adress, String phone, String type){
        staffName=name;
        staffAdres=adress;
        staffPhoneNumber=phone;
        staffType=type;
    }
    public String toString() {
        return "C07_Hastane Objesi==> " +
                "personelIsmi:'" + staffName + '\'' +
                ", personelAdresi:'" + staffAdres + '\'' +
                ", personelTelefon:'" + staffPhoneNumber + '\'' +
                ", personelTuru:'" + staffType + '\'';
    }
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
