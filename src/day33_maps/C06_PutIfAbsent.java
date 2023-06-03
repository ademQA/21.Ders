package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_PutIfAbsent {
    //Question : Print the numbers used in a given array and how many times it is used.
    // Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
    //        output :a kullanimi : 4 adet
    //                b kullanimi : 2 adet
    //                c kullanimi : 2 adet
    //                d kullanimi : 1 adet
    //                k kullanimi : 1 adet
    //                s kullanimi : 3 adet
    //                z kullanimi : 1 adet
    public static void main(String[] args) {
        String[] letters = {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"} ;
        Map<String,Integer>lettetUsageMap=new TreeMap<>();
        for (String eachLetter:letters) {
            if (!lettetUsageMap.containsKey(eachLetter)){
                lettetUsageMap.put(eachLetter,1);
            }else {
                int count = lettetUsageMap.get(eachLetter);
                lettetUsageMap.put(eachLetter,count+1);
            }
        }

        System.out.println(lettetUsageMap);


        //********************************2.method*****************************************

        Map<String,Integer>lettetUsageMap2=new TreeMap<>();
        for (String eachLetter:letters) {
            if (lettetUsageMap2.putIfAbsent(eachLetter,1)!=null){

                int count = lettetUsageMap2.get(eachLetter);
                lettetUsageMap2.put(eachLetter,count+1);
            }
        }

        System.out.println(lettetUsageMap2);


    }
}
