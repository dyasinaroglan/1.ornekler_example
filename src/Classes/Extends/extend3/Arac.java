package Classes.Extends.extend3;

public class Arac {
    protected Turu türü; //sadece extend edenler ulaşabilir. farklı packagelarda görebiliriz.
    //public ile default arasında bir şey.
    private int model;


    public Arac(Turu türü, int model) {
        this.türü = türü;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "türü=" + türü +
                ", model=" + model +
                '}';
    }
}
