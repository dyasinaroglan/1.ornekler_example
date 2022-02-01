package JavaLocalDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTime2 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss"); //hh küçük harfle olursa küçük sayı formatında 05;30
        System.out.println(time.format(format));
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(format1)); //H büyük olursa büyük sayı formatında saaati veriyor.

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss a"); //bosluk a yazdığımda öğleden önce mi sonra mı yazar.
        System.out.println(time.format(format2));

        // System.out.println(time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))); TİME DE bunları yazamıyoruz.


    }
}
