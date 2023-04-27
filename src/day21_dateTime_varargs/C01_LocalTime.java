package day21_dateTime_varargs;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime time =LocalTime.now();

        // calistigi anda sistemde var olan zamani alip saat variable'na kaydeder
        // kronometre gibi calismaz sadece 9.satirin calistigi zamani kaydeder
        // eger farkli satirlarin calisma zamanlarini gormek istersek
        // o satirlarda da yeni localTime objeleri olusturmaliyiz

        System.out.println(time); // 10:04:40.576670
        // zamani saat,dakika,saniye ve nano saniye olarak kaydeder

        System.out.println(time.getNano());//576670

        System.out.println(time.getSecond());//40
        // get() lari bize saatin istedigimiz bolumunu getirir
        System.out.println(time.withHour(14)); // 14:08:05.188338
        System.out.println(time.withSecond(6));
        System.out.println(time.withHour(11).withSecond(0).withNano(0)); // 11:10
        System.out.println(time.withHour(14).withMinute(45).withSecond(34).withNano(23456));
        // with() lari saatin istedigimiz bolumunu istedigimiz yeni bir deger ile degistirerek zamani verir
        System.out.println(time.plusHours(100)); // 14:12:47.784817
        System.out.println(time.plusHours(25).plusMinutes(65));
        System.out.println(time.plusMinutes(10000)); // 08:53:30.314276
        System.out.println(time.minusHours(37).minusMinutes(22)); // 20:52:19.679568
        // plus() ve minus() saati istedigimiz miktarda ileri veya geri goturur
        // istedigimiz saat,dakika, saniye ve nano saniye ile zaman variable'i olusturmak istersek
        LocalTime wantedTime= LocalTime.of(12,23,15,10);
        System.out.println(wantedTime); // 12:23:15.000000010
        // iki zamani birbiriyle karsilastirmak istersek
        System.out.println(wantedTime.isAfter(time));// true
        System.out.println(wantedTime.isBefore(time)); // false
        System.out.println(time.compareTo(wantedTime)); // -1
        System.out.println(wantedTime.compareTo(time)); // 1
        // iki zamani karsilastirir, kucukse negatif, buyukse pozitif bilgi doner


    }

    }

