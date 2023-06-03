package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {
    public static void main(String[] args) {
        Map<String,Integer>countLetterUsage=new TreeMap<>();
        countLetterUsage.put("A",20);
        countLetterUsage.put("K",10);
        countLetterUsage.put("C",25);
        countLetterUsage.put("M",23);
        countLetterUsage.put("Z",32);
        System.out.println(countLetterUsage);//{A=20, C=25, K=10, M=23, Z=32}

        //Double the value of A
        int oldValue=countLetterUsage.get("A");
        countLetterUsage.put("A",oldValue*2);
        System.out.println(countLetterUsage); //{A=40, C=25, K=10, M=23, Z=32}

        //If b exists, increase its value by 3
        if (countLetterUsage.containsKey("B")){
            oldValue=countLetterUsage.get("B");
            countLetterUsage.put("B",oldValue+3);
            System.out.println(countLetterUsage); //{A=40, C=25, K=10, M=23, Z=32}
        }

        //double the value of A
        countLetterUsage.compute("A",(k,v)->2*v);
        System.out.println(countLetterUsage);   //{A=80, C=25, K=10, M=23, Z=32}

        //If b exists, increase its value by 3
        countLetterUsage.computeIfPresent("B",(k,v)->v+3);
        countLetterUsage.computeIfPresent("M",(k,v)->v+3);
        System.out.println(countLetterUsage);   //{A=80, C=25, K=10, M=26, Z=32}

       // if d does not exist add the value as 5

        countLetterUsage.computeIfAbsent("D",v->5);
        countLetterUsage.computeIfAbsent("C",v->6);
        System.out.println(countLetterUsage);   //{A=80, C=25, D=5, K=10, M=26, Z=32}

    }
}
