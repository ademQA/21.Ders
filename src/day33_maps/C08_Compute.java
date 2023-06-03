package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C08_Compute {
    public static void main(String[] args) {

        String[] letters = {"a", "b", "s", "a", "s", "c", "d", "b", "c", "a", "a", "s", "z", "k"};
        Map<String, Integer> lettetUsageMap = new TreeMap<>();
        for (String eachLetter : letters) {
            lettetUsageMap.computeIfPresent(eachLetter,(k,v)->v+1);
            lettetUsageMap.putIfAbsent(eachLetter,1);
        }
        System.out.println(lettetUsageMap);
    }
}