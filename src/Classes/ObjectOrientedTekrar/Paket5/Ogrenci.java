package Classes.ObjectOrientedTekrar.Paket5;

public class Ogrenci {
    String isim;
    int numara;
    Ogrenci arkadas;

    public Ogrenci(String isim, int numara) {
        this.isim = isim;
        this.numara = numara;
    }
    public void arkadasAta(Ogrenci arkadas){
        this.arkadas = arkadas;
        if(arkadas.arkadas == null)
        arkadas.arkadasAta(this);

    }
    public void arkadasSıl(){
        this.arkadas = null;
    }

    @Override
    public String toString() {
        return "Ogrenci" +
                "\nisim = " + isim + '\'' +
                "\nnumara = " + numara +
                "\narkadas = " + arkadas.isim;
        //sadece arkadas yazdırsaydık sonsuz döngüye girerdi.çünkü her defasında Ogrenci class ından arkadas nesnesini çağıracaktı.
        //arkadas.isim de ise sasdece String ifadeyi yazdırır ve biter.
    }
}
