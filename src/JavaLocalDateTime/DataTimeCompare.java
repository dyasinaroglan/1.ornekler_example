package JavaLocalDateTime;

import java.time.LocalDate;

public class DataTimeCompare {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);
        LocalDate yarın = bugun.plusDays(1);
        System.out.println(yarın);
        System.out.println(dun);

        System.out.println(bugun.isAfter(dun)); //boolean çalışır. isAfter bugün dünden sonra mı?
        System.out.println(dun.isBefore(bugun)); //dün bugünden önce mi?
        System.out.println(bugun.isEqual(dun)); //dün bugüne eşit mi?
        System.out.println(bugun.isLeapYear()); //LeapYear--> artık yıl 29 şubat

        System.out.println(bugun.compareTo(dun)); //compare-->karşılaştırmak

        LocalDate d1 = LocalDate.of(2022,6,15);
        LocalDate d2 = LocalDate.of(2011,2,2);
        LocalDate d3 = LocalDate.of(2022,1,2);
        LocalDate d4 = LocalDate.of(2022,6,2);

        System.out.println(d1.compareTo(d2));
        System.out.println(d3.compareTo(d4)); //iki zaman dilimini karşılaştırıp aradaki farkı çıkarıyor. kaç gün var? kaç yıl var ?
    }
}
