package day23_encapsulation_inheritance;

import day22_String_Builder.C04_accessModifier;

public class C01_AccessModifierUsage extends C04_accessModifier {
    public static void main(String[] args) {
        System.out.println(C04_accessModifier.publicStaticNumber);
        C04_accessModifier.publicStaticMethod();
        C04_accessModifier.publicStaticNumber=20;
        C04_accessModifier.protectStaticNumber=10;
        System.out.println(publicStaticNumber);
        System.out.println(protectStaticNumber);
    }
}
