package JavaLocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDate2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); //şimdiki tarihi veriyor.
        System.out.println(date);

        LocalDate date1 = LocalDate.of(1991,05,19);
        System.out.println(date1); //bu da bizim istediğimiz tarih.
        System.out.println(date1.getDayOfWeek()); //o yılın hangi günü olduğunu bize verir.
        System.out.println(date1.getDayOfYear()); //yılın 139. günü. o yılın kaçıncı gün olduğunu veriyor.

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth()); // bu şekilde ayrı ayrı ay yıl ve günleri çağırabiliyoruz.

        //DATETİME FORMATTER var.

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println(formatter.format(date1));
        System.out.println("---------------------");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println(formatter1.format(date1));
        System.out.println("---------------------");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("DD.MM.yyy"); //DD yazarsak yılın günü olarak algılıyor.
        System.out.println(formatter2.format(date1));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyy");
        System.out.println(formatter3.format(date1));
        System.out.println("************************");
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            System.out.println(locale);
        }
            System.out.println("************");
            Locale tr = new Locale("si","Sİ");
            System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(tr)));

            Locale[] locales1 = Locale.getAvailableLocales(); //mevcut lokaller

        }
    }

