package JavaLocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class StringToDateTime {
    public static void main(String[] args) {
        String str = "19 05 1991";

        DateTimeFormatter readFormat = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate strDate = LocalDate.parse(str,readFormat);
        System.out.println(strDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println(strDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        String str1 = "10.23";
        String str2 = "10:23";

        System.out.println(LocalTime.parse(str1,DateTimeFormatter.ofPattern("HH.mm")).plusMinutes(3));
        System.out.println(LocalTime.parse(str2).plusHours(2));
    }
}
