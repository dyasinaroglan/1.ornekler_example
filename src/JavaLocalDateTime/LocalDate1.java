package JavaLocalDateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDate1 {
    public static void main(String[] args) {

        //local date--> yıl ay gün içerir.
        LocalDate date = LocalDate.now(); //bugünün tarihini verir.  NOW--static method
        System.out.println(date);

        //eger istediğim bir tarih ise
        LocalDate date1 = LocalDate.of(1991,05,19);
        LocalDate date2 = LocalDate.of(1991, Month.MAY,19);

        System.out.println(date.getYear());
        System.out.println(date.getMonth()); //hangi ay ise bunu isim olarak verir.
        System.out.println(date.getMonthValue());;// o ayın kaçıncı ay olduğunu rakamla verir.
        System.out.println("*******************");
        System.out.println(date1.getDayOfWeek()); //haftanın günü
        System.out.println(date1.getDayOfYear()); //yılın günü
        System.out.println(date1.getDayOfMonth()); //ay ın günü

        LocalDate rukiye = LocalDate.of(1993,8,24);
        System.out.println(rukiye.getDayOfWeek());
        System.out.println("********************");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d.M.yyy");
        System.out.println(rukiye.format(format));
        System.out.println(rukiye.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(rukiye.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(rukiye.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(rukiye.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("**************************");
        System.out.println("**************************");
        LocalDate sümeyra = LocalDate.of(1988,Month.AUGUST,10);
        System.out.println(sümeyra.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(sümeyra.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(sümeyra.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(sümeyra.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ENGLISH)));
        System.out.println("*********");
        System.out.println(rukiye.format(format1));

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            //System.out.println(locale); //kaç tane lokal var dünya üzerinde
            
        }
        Locale tr = new Locale("tr","TR");
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(tr)));
    }

}
