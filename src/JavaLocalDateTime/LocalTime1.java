package JavaLocalDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTime1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime time1 = LocalTime.of(2,12,34,123);
        System.out.println(time1.getHour()); //saati alabiliyoruz
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());
        System.out.println(time1.getNano());

        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(format);
        System.out.println(time1);
        System.out.println(time);
        for (int i = 0; i < 100; i++) {
            //System.out.println(LocalTime.now());
            //sleep(3);
        }
    }
    public static void sleep(long milis){
        try {
            Thread.sleep(milis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
