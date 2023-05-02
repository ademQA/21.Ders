package day23_encapsulation_inheritance;

public class C07_ChildClass extends C06_Parent{
    public static void main(String[] args) {

        C04_encapsuleClass objBaskaClass= new C04_encapsuleClass();
        System.out.println(objBaskaClass.publicStr);

        C07_ChildClass objKendiClass= new C07_ChildClass();
        System.out.println(objKendiClass.strPublic); // Parent class strPublic
        System.out.println(objKendiClass.strDefault); // Parent class strDefault
        System.out.println(objKendiClass.strProtected); // Parent class strProtected

        //System.out.println(objKendiClass.strPrivate);

        objKendiClass.strProtected="Child da atanan deger";
        objKendiClass.protectedMethod(); // Parent class protected method
        objKendiClass.defaultMethod(); // Parent class default method
        objKendiClass.publicMethod(); // child class public method
    }
    public void publicMethod(){
        System.out.println("child class public method");
    }
    }



