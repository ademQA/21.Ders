package day25_inheritance;

public class C02_Nurse {
    String name="name not assigned ";
    String duty="Nurse";
    String str="Nurse";
    int number=30;
    boolean isHoliday=false;

    public void wage(){
        System.out.println("Nurse wage is:"+2000);
    }
    public void watch(){
        System.out.println("Nurses are on duty 2 days a week");
    }
    public void specialInsurance(){
        System.out.println("nurses can take out private insurance");
    }

}
