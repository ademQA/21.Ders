package day25_inheritance;

public class C02_ServiceNurse extends C02_Nurse{
    String str="Service Nurse";
    int number=20;


    public static void main(String[] args) {
        C02_ServiceNurse serviceNurse=new C02_ServiceNurse();
        serviceNurse.notStaticMethod();
    }
    public void notStaticMethod(){
        watch();
        this.watch();
        super.watch();

        wage();
        this.wage();
        super.wage();

        workDay();
        this.workDay();
        //super.workDay();

        String str="Method";

        System.out.println(str);
        System.out.println(this.str);
        System.out.println(super.str);

        System.out.println(isHoliday);
        System.out.println(this.isHoliday);
        System.out.println(super.isHoliday);

        char firstLetter='J';
        System.out.println(firstLetter);
      // System.out.println(this.firstLetter);//CTE
      // System.out.println(super.firstLetter);//CTE
    }
    public void watch(){
        System.out.println("service nurses are on duty 3 days a week");
    }
    public void workDay(){
        System.out.println("service nurses work 4 days a week");
    }
}
