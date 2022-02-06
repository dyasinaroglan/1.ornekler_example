package Bolum8.Classes.modifiers.Classes.getterSetter;

public class Banka {

    private int subeNo;
    private String sube;     //BUNLARI KORUYORUZ.KAPSÜLLEME. VERİ TUTANLAR BUNLAR.
    private double bakiye;

    public Banka(int subeNo, String sube,double bakiye) {   //PRİVATE YAPTIĞIMDA constructor ın içinde müdahale edebilirim
        this.subeNo = subeNo;
        this.sube = sube;
        if(bakiye>0)  //bakiye sıfırdan büyükse bakiye açmaya izin ver şartı koyuyoruz. diğer tarafta -100 de yazsak bakiyeye bunu engellicek
        this.bakiye =bakiye;
    }
    public int getSubeNo() { //işte bu tarz müdahaleleri burada yapmak için,yani işi burada halletmek için private kullanırız.
        if (subeNo > 0) {
        }
        return subeNo;
    }
    public void setSubeNo(int subeNo) {
        this.subeNo = subeNo;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatır(int miktar){
        if(miktar>0){
            bakiye+=miktar;
        }
    }
    public void paraCek(int cekilenPara){
        if(bakiye>=cekilenPara){
            bakiye-=cekilenPara;
        }
    }
}
