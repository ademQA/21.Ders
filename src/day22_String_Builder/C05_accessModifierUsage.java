package day22_String_Builder;

public class C05_accessModifierUsage {
    public static void main(String[] args) {
        C04_accessModifier.defaultStaticMethod();
        System.out.println(C04_accessModifier.publicStaticNumber);
        C04_accessModifier obj=new C04_accessModifier();
        obj.protectedMethod();
    }
    void otherClassUsage(){
        C04_accessModifier.defaultStaticMethod();
        System.out.println(C04_accessModifier.publicStaticNumber);
        C04_accessModifier obj=new C04_accessModifier();
        obj.protectedMethod();
        System.out.println(obj.protectedStr);
    }
}
