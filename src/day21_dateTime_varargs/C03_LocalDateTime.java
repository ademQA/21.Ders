package day21_dateTime_varargs;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime dh = LocalDateTime.now();
        System.out.println(dh); // 2023-04-25 T 11:04:32.099758
        // tarih ve saati su sekilde yazdirin 25/04/2023 11:04
        System.out.println(dh.getDayOfMonth()+"/"+dh.getMonthValue()+"/"+
                dh.getYear()+ " " + dh.getHour() + ":" + dh.getMinute()); // 25/4/2023 11:8
        System.out.println(dh.plusHours(100));
    }
}
