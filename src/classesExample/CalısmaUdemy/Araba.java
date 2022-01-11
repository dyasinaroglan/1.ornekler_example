package classesExample.CalısmaUdemy;

public class Araba {
    private String renk;
     private int kapılar;
     private int tekerlekler;
      private String motor;
      private String model;  //başka bir java dosyasından erişemiyoruz. private olduğunda
    //public olduğunda başka bir java dosyasından erişebiliyoruz.
    //örneğin yanlışlıkla kapı değişkenine -4 değeri verildi. bunu engellmek için private yapıp method yardımıyla
    //oradaki değişkenin ne olacağına kendimiz karar verebiliriz.

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setKapılar(int kapılar) {
        if(kapılar<0){
            System.out.println("kapılar 0'dan küçük olamaz");
        }else {
            this.kapılar=kapılar;
        }
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setModel(String model){
        this.model =model;
    }

    public String getRenk() {
        return renk;
    }

    public int getKapılar() {
        return kapılar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public String getModel(){
        return this.model;
    }
}
