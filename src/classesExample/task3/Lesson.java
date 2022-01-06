package classesExample.task3;

public class Lesson {
    String name;
    int hour;

    public Lesson(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "" + name + "-" +hour+""; // Lesson içinde toString ile yazdırdık. çünkü Student class ında Lesson u yazdırmamız lazım.
        //bunu yazdırmamız için bu şekilde tanımlamamız lazım.
        //yani sen Lesson class ını yazdırmak istediklerinde bunu yazdır dedik
    }
}
