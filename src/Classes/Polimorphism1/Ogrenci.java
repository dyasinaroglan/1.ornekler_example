package Classes.Polimorphism1;

public class Ogrenci extends Insan{
    String okul;

    public Ogrenci(String adı, String okul) {
        super(adı);
        this.okul = okul;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adı='" + adı + '\'' +
                ", okul='" + okul + '\'' +
                '}';
    }
}
