package day27_pollymorphism_abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_OverridingReturnType {
    void method1(){

    }
    double method2(){
        return 0;
    }
    Object method3(){
        return "Java Candır";
    }
    Object method4(){
        return 3.4;
    }
    List<String>method5(){
        return new ArrayList<>();
    }
}
