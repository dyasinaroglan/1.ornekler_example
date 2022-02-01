package JavaLocalDateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Duration {
    public static void main(String[] args) {
        /*Set<String> bolgeler = ZoneId.getAvailableZoneIds();
        for (String s : bolgeler) {
            System.out.println(s);
        }

         */

        //duration--zamanlar arası fark   //duration--zamanlar arası fark  duaration=süre demek
        LocalTime time = LocalTime.now();
        LocalTime time1 = LocalTime.now(ZoneId.of("Hongkong"));
        java.time.Duration duration = java.time.Duration.between(time,time1);
        System.out.println(duration.getSeconds());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

        LocalTime turkey = LocalTime.now();
        LocalTime PacificGuadalcanal = LocalTime.now(ZoneId.of("Pacific/Guadalcanal"));

        java.time.Duration duration1 = java.time.Duration.between(turkey,PacificGuadalcanal);

        System.out.println(duration1.toHours()); //pasifik ile aramızdaki saat farkı.
        System.out.println(duration1.toMinutes()); //dakika olarak



    }
}
