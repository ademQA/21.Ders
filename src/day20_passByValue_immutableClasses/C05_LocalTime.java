package day20_passByValue_immutableClasses;
import java.time.LocalTime;
import java.time.ZoneId;
public class C05_LocalTime {
    public static void main(String[] args) {
 /*
        java'da zaman ve tarih ile ilgili pekcok class vardir
        biz 3 class gorecegiz
        LocalTime class'i saat ile ilgili method'lar icerir
         */
        LocalTime startTime = LocalTime.now();
        // LocalTime.now() bulundugu satir calistiginda bilgisayarin saatini alip kaydeder
        // saat variable'i canli bir kronometre degil,
        // bulundugu satirin calistigi zamani kaydeden bir variable'dir
        System.out.println(startTime);
        int total = 0;
        for (int i = 0; i <= 50000 ; i++) {
            total += i;
        }
        System.out.println(total);
        LocalTime finishTime = LocalTime.now();
        System.out.println(finishTime);
        LocalTime time = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(time);

        LocalTime time2 = LocalTime.of(11,20,25);
        System.out.println(time2); // 11:20:25
        LocalTime time3 = LocalTime.ofSecondOfDay(15000);
        System.out.println(time3);    // 04:10
    }
    }

