package JavaLocalDateTime;

import java.time.LocalDate;
import java.time.Period;

public class Periyod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(1991,05,19);
        Period period = Period.between(date1,date);
        System.out.println(period.getYears()); //30 yıl
        System.out.println(period.getMonths());  // 8 ay
        System.out.println(period.getDays()); //13 gün
        //30 yıl 8 ay 13 gün önce doğmuşum.

        System.out.println(date.plusDays(1));
        System.out.println(date.plusYears(3));
        System.out.println(date.minusDays(-1)); //1 arttır
        System.out.println(date.plusDays(-1)); //1 çıkart

        System.out.println(date.plusYears(3).plusMonths(3).plusDays(3)); // 3 yıl 3 ay 3 gün ekledim.
        System.out.println(date.plusYears(5).plusMonths(5).plusDays(5)); // 5 yıl 5 ay 5 gün eklendi

        Period p = Period.ofDays(1);
        System.out.println(date.plus(p));

    }
}
