package JavaLocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalTime3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        //System.out.println(time);

        //1+2+3+4......+1 000 000 000 java bunları kaç saniyede toplar?
        LocalTime t1 = LocalTime.now();
        System.out.println();
        int a =0;
        for (int i = 0; i < 1_000_000_000; i++) {
            a+=i;
        }
        LocalTime t2 = LocalTime.now();
        System.out.println(t1 + ","+ t2);
        System.out.println("*********************");
        System.out.println("*********************");

        System.out.println(time.format(DateTimeFormatter.ofPattern("HH.mm.ss")));
        System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm")));
        System.out.println(time.format(DateTimeFormatter.ofPattern("h.m")));
        System.out.println(time.format(DateTimeFormatter.ofPattern("H.m a"))); //boşluk bırakıp a koyarsak öğleden önce mi
        //öğleden sonra mı bunu verir.
        System.out.println("*************************");

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter mix = DateTimeFormatter.ofPattern("dd/MM/yy HH.mm");
        System.out.println(dateTime.format(mix));
    }
}
