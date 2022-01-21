package Classes.Polimorphism1;

public class Calısan extends Insan{

    double maas;

    public Calısan(String adı, double maas) {
        super(adı);
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Calısan{" +
                "maas=" + maas +
                ", adı='" + adı + '\'' +
                '}';
    }
}
