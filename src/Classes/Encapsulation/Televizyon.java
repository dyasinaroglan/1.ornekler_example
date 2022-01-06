package Classes.Encapsulation;

public class Televizyon {
      int kanal;
    int sesSeviyesi;
    private boolean acık;

     //bir nesnenin YAPABİLECEĞİ şeyleri method ile nesnenin özelliklerini ise method yardımı ile yazarız
    public void kapat(){
        if(acık== true) {
            System.out.println("televizyon kapanıyor");
            acık = false;
        }else {
            System.out.println("televizyon zaten kapalı");
        }
    }
    public void setKanal(int yeniKanal){
        if(acık&& yeniKanal>0 && yeniKanal<500){
            kanal=yeniKanal;
        }
        else {
            System.out.println("tv kapalı veya yanlış bir kanal değeri yazdınız");
        }
    }
    public void ac(){
        if(acık==false) {
            System.out.println("televizyon açılıyor");
            acık = true;
        }
        else {
            System.out.println("televizyon zaten açık ");
        }

    }

    public int getKanal() {
        return kanal;
    }

    public int getSesSeviyesi(int sesSeviyesi) {
        if(acık&& sesSeviyesi>0 && sesSeviyesi<20)
            this.sesSeviyesi=sesSeviyesi;
        return sesSeviyesi;
    }

    public void yazdır(){
        System.out.println("tv açık:"+acık+"\nkanal no:"+kanal+"\nses seviyesi: "+sesSeviyesi);
    }
}
