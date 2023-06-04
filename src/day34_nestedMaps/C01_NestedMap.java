package day34_nestedMaps;
import java.util.HashMap;
import java.util.Map;

public class C01_NestedMap {
    public static void main(String[] args) {
        Map<Integer, Map<String,String >> studentMap = new HashMap();
        Map<String,String > studentKnowledgeMap101 = new HashMap<>();
        studentKnowledgeMap101.put("isim","Ali");
        studentKnowledgeMap101.put("soyisim","Can");
        studentKnowledgeMap101.put("sinif","11");
        studentKnowledgeMap101.put("sube","H");
        studentKnowledgeMap101.put("brans","MF");
        studentMap.put(101,studentKnowledgeMap101);
        System.out.println(studentMap); //{101={sinif=11, sube=H, soyisim=Can, brans=MF, isim=Ali}}

        Map<String,String > studentKnowledgeMap102 = new HashMap<>();
        studentKnowledgeMap102.put("isim","Veli");
        studentKnowledgeMap102.put("soyisim","Cem");
        studentKnowledgeMap102.put("sinif","10");
        studentKnowledgeMap102.put("sube","K");
        studentKnowledgeMap102.put("brans","TM");
        studentMap.put(102,studentKnowledgeMap102);
        System.out.println(studentMap);
        //{101={sinif=11, sube=H, soyisim=Can, brans=MF, isim=Ali},
        // 102={sinif=10, sube=K, soyisim=Cem, brans=TM, isim=Veli}}

        Map<String,String > studentKnowledgeMap103 = new HashMap<>();
        studentKnowledgeMap103.put("isim","Ali");
        studentKnowledgeMap103.put("soyisim","Cem");
        studentKnowledgeMap103.put("sinif","11");
        studentKnowledgeMap103.put("sube","K");
        studentKnowledgeMap103.put("brans","TM");
        studentMap.put(103,studentKnowledgeMap103);
        System.out.println(studentMap);
        //{101={sinif=11, sube=H, soyisim=Can, brans=MF, isim=Ali},
        // 102={sinif=10, sube=K, soyisim=Cem, brans=TM, isim=Veli},
        // 103={sinif=11, sube=K, soyisim=Cem, brans=TM, isim=Ali}}

        System.out.println(studentMap.get(101)); //{sinif=11, sube=H, soyisim=Can, brans=MF, isim=Ali}

        System.out.println(studentMap.get(102).get("soyisim")); // Cem

        System.out.println(studentMap.get(103).get("brans")); // TM


    }
}
