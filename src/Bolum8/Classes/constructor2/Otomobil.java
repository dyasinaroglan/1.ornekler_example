package Bolum8.Classes.constructor2;

public class Otomobil {
    String renk;
    String model;
    int yıl;
    double motorHacmi;

    public Otomobil(){
        renk ="renk bilinmiyor";
        model="model bilinmiyor";
        yıl= 9999;

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
