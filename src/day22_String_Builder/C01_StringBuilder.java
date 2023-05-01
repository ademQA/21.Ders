package day22_String_Builder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        Object obj1="java";
        Object obj2=23;
        Object obj3=true;
        StringBuilder sb2=new StringBuilder("Java Candır");

        System.out.println(sb2); //Java Candır
        System.out.println(sb2.length()); //11
        System.out.println(sb2.capacity()); //11+16=27

        sb2.append(", buna inanmayan mi var ?");

        System.out.println(sb2); //Java Candır, buna inanmayan mi var ?
        System.out.println(sb2.length()); //36
        System.out.println(sb2.capacity()); //27*2+2=56

        sb2.trimToSize();

        System.out.println(sb2.length()); //36
        System.out.println(sb2.capacity());//36

    }
}
