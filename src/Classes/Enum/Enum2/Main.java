package Classes.Enum.Enum2;

public class Main {
    public static void main(String[] args) {

        Ayy ayy = new Ayy(31);

        Aylar ay1 = Aylar.HAZİRAN;
        System.out.println(ay1);
        System.out.println(ay1.getGunSayısı());

        Aylar ay2 = Aylar.MAYIS;
        System.out.println(ay2);
        System.out.println(ay2.getGunSayısı());

    }
}


class Ayy{
    private int gunSayısı;

    Ayy(int gunSayısı) {
        this.gunSayısı = gunSayısı;
    }

}
