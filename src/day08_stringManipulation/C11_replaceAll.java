package day08_stringManipulation;

public class C11_replaceAll {
    public static void main(String[] args) {
        String str="Ja65875va8  c2887andı687r";
        String str1="Jav2574535743%%5a ca89797?dır888/+%%%&//";
        System.out.println(str.replaceAll("\\d", ""));
        str1=(str1.replaceAll("\\d", ""));
        System.out.println(str1);
        str1=str1.replaceAll("\\W","");
        System.out.println(str1);
    }
}
