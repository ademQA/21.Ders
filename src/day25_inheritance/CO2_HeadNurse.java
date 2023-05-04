package day25_inheritance;

public class CO2_HeadNurse extends C02_Nurse{
CO2_HeadNurse(){
    System.out.println("address");
    address="Cankaya";
    System.out.println(duty);
    System.out.println("general duty:"+super.duty);
    name="Ayşe";
    System.out.println(this.name);
    System.out.println(super.name);
    this.wage();
    watch();
    this.watch();
    super.watch();
    specialInsurance();
    this.specialInsurance();
    super.specialInsurance();
    compensation();
    this.compensation();

}
String duty="Head Nurse";
String address="Address not specified";
public void wage(){
    System.out.println("head nurses are on duty 3 days a month");
}
public void compensation(){
    System.out.println("head nurses receive 13 salaries");
}

    public static void main(String[] args) {
        CO2_HeadNurse headNurse=new CO2_HeadNurse();
    }
}


