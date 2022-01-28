package classesExample.Ornek3;

public class Insan {
    String isim;
    boolean ehliyet;
    Arac arac;
    String durum = "Bosta";

    public Insan(String isim, boolean ehliyet) {
        this.isim = isim;
        this.ehliyet = ehliyet;
    }
    public void aracBin(Arac arac){
        if (arac.getSoför() == null){
            arac.setSoför(this);
            this.arac = arac;
            System.out.println("araca bindim");
            durum = "araçta";

        }else {
            System.out.println("aracın zaten bir soförü var.");
        }
    }
    public void aracİn(){
        if(arac == null){
            System.out.println("arabaya binmedim ki");
        }else if(arac.isCalısıyor()){
            System.out.println("araba çalışıyor inemem");
        }else {
            this.arac.setSoför(null); //önce söforu indirmem lazım sonra aracı boşa çıkarmam gerek
            this.arac = null; // aracı boşa çıkarmamız lazım. hala araçta gözükmemesi için.
            this.durum = "boşta";
            System.out.println("indim");
        }
    }
    public void sur(){
        if (!ehliyet ){
            System.out.println("ehliyetim yok, süremem");
        }else if (arac == null){
            System.out.println("araca binmedim ki, süremem ");
        }else {
            durum = "çalışıyor";
            arac.setCalısıyor(true);
            System.out.println("sürüyorum");
        }
    }
    public void dur(){
        if (arac.isCalısıyor()){
            System.out.println("durdum");
            arac.setCalısıyor(false );
        }else if (arac == null){ //araca binmemişse
            System.out.println("araca binmedim ki, duramam");
        }else if(!arac.isCalısıyor()){
            System.out.println("araç çalışmıyor ki");
        }

    }

    @Override
    public String toString() {
        return "Insan{" +
                "isim='" + isim + '\'' +
                ", ehliyet=" + ehliyet +
                ", arac=" + arac +
                '}';
    }
}
