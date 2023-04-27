package day17_constructors;

public class C05_Hospital {

    /*
    Bir class'da gorunurde constructor yoksa
    default constructor vardir

    default constructor parametresiz bir constructor'dir
    ve body'sinde hic bir kod bulunmaz

    default constructor asagida verilen constructor'a benzer
    C05_Hastane (){

    }
    ancak bir constructor gorunur ise
    artik ona default constructor demeyiz
    parametresi yoksa ona parametresiz constructor diyebiliriz

    biz herhangi bir constructor olusturursak
    java default constructor'i siler
    yani bir class'da gorunur bir constructor varsa
    DEFAULT CONSTRUCTOR yoktur, diyebiliriz

     */
    C05_Hospital(){

        System.out.println("parameterless code worked");
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
