package day17_constructors;

public class C07_Hospital {
    /*
        Biz gorunur bir constructor olusturdugumuzda
        Java default constructor'i siler
        Biz gorunur constructor olusturdugumuzda, daha once
        default constructor'i kullanarak olusturulan objeler
        CTE verir
        Boyle bir soruna sebep olmamak icin
        gorunur bir constructor olusturdugumuzda
        default constructor'in islevini yapan
        parametresiz bir constructor da olustururuz
     */
    public C07_Hospital(String isim){
        System.out.println("name parameter constructor");
    }
    public C07_Hospital(){
        System.out.println("parameterless constructor");
    }

    @Override
    public String toString() {
        return "C07_Hospital{" +
                "staffName='" + staffName + '\'' +
                ", staffAdres='" + staffAdres + '\'' +
                ", staffPhoneNumber='" + staffPhoneNumber + '\'' +
                ", staffType='" + staffType + '\'' +
                '}';
    }

    /*  public String toString() {
            return "C07_Hastane Objesi==> " +
                    "personelIsmi:'" + staffName + '\'' +
                    ", personelAdresi:'" + staffAdres + '\'' +
                    ", personelTelefon:'" + staffPhoneNumber + '\'' +
                    ", personelTuru:'" + staffType + '\'';
        }

       */
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
