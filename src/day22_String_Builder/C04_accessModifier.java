package day22_String_Builder;

public class C04_accessModifier {
    public C04_accessModifier(){

    }
    private String privateStr;
    String defaultStr;
    protected String protectedStr;
    public String publicStr;

    private static int privateStaticNumber;
    static int defaulStaticNumber;
    protected static int protectStaticNumber;
    public  static int publicStaticNumber;

    private  void privateMethod(){

    }
      void defaultMethod(){

    }
    protected   void protectedMethod(){

    }
    public   void publicMethod(){

    }
    private static void privateStaticMethod(){

    }
    static void  defaultStaticMethod(){

    }
    protected static   void protectedStaticMethod(){

    }
    public static   void publicStaticMethod(){

    }


    public static void main(String[] args) {
        C04_accessModifier obj=new C04_accessModifier();
        obj.protectedMethod();
        System.out.println(protectStaticNumber);

    }
    public void classMemberUsage(){
        System.out.println(privateStaticNumber);
        publicStaticMethod();
        protectedMethod();
    }
}
