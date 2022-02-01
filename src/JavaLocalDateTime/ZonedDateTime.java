package JavaLocalDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTime {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime time1 = LocalDateTime.now(ZoneId.of("America/Toronto"));
        System.out.println(time1);
        System.out.println(time);

        Set<String> bolgeler = ZoneId.getAvailableZoneIds();
        for (String s : bolgeler) {
            System.out.println(s);

        }
        java.time.ZonedDateTime zonedDateTime = java.time.ZonedDateTime.now(ZoneId.of("Europe/Nicosia")); //+2 saat bizden daha gerideler.
        System.out.println(zonedDateTime);
    }
}
