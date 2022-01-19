package Classes.Extends.extend3;

public class Otomobil extends Arac {
    String marka;


    public Otomobil(Turu türü, int model, String marka) {
        super(türü, model);
        this.marka = marka;  //sadece marka nın constructurunu seçebiliyorum. fakat Arac a ait constructorlar
        //otomatik uazılıyor.

    }
}
