package day23_encapsulation_inheritance;

public class C05_encapsuleClassRunner {
    public static void main(String[] args) {
        C04_encapsuleClass obj = new C04_encapsuleClass();
        obj.publicStr = "Java super"; // write
        System.out.println(obj.publicStr); // read

        obj.setPrivateStr("Herşeyi düşünmüşler");
        System.out.println(obj.getPrivateStr());
    }
}
