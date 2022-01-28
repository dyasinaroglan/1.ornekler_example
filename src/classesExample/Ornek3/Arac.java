package classesExample.Ornek3;

public class Arac {
    String isim;
    Insan soför;
    boolean calısıyor = false;

    public Arac(String isim) {
        this.isim = isim;
    }

    public void setSoför(Insan soför) {
            this.soför = soför;
    }

    public Insan getSoför() {
        return soför;
    }

    public boolean isCalısıyor() {
        return calısıyor;
    }

    public void setCalısıyor(boolean calısıyor) {
        this.calısıyor = calısıyor;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "isim='" + isim + '\'' +
                ", soför=" + soför +
                ", calısıyor=" + calısıyor +
                '}';
    }
}
