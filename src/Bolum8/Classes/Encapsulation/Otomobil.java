package Bolum8.Classes.Encapsulation;

public class Otomobil {
    private String renk;
    private String model;
    private int yıl;
    private double motorHacmi; //PRİVATE özel demek bu sınıfa özel.başka sınıflardan çağıramıyorum.
    //

    public Otomobil(){
        renk ="renk bilinmiyor";
        model="model bilinmiyor";
        yıl= 9999;

    }

    public String getRenk() {
        return renk;
    }

    public String getModel(String model) {
         this.model=model;
         return model;
    }

    public int getYıl(int yıl) {
        this.yıl=yıl;
        return yıl;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public double setMotorHacmi(double motorHacmi){
        this.motorHacmi=motorHacmi;
        return motorHacmi;

    }

    public Otomobil(String renk){
        this.renk=renk;
    }
    public Otomobil(String renk,String model){
        this(renk);
        this.model=model;
    }
    public Otomobil(String renk,String model,int yıl){
        this(renk,model);
        this.yıl=yıl;
    }
    public Otomobil(String renk,String model,int yıl,double motorHacmi){
        this(renk,model,yıl);
        this.motorHacmi=motorHacmi;
    }
    public void arabanınÖzellikleriYazdır(){
        System.out.println("arabanın rengi-->"+ renk+"\narabanın modeli-->"+model+"\narabanın üretim yılı-->"+yıl+"\narabanın motor hacmi-->"+motorHacmi);
    }

}
