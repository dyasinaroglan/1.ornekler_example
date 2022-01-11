package classesExample.CalısmaUdemy1;

public class Account {
     String hesapNo;
   double bakiye;
     String isim;
    String email;
     String telefonNo;

    public Account(){
     //   System.out.println("kendi oluşturduğumuz constractor");
        //acc2 nesnesini çağırır. boş olanı
        /*this.hesapNo ="bilgi yok";
        this.bakiye=0.0;
        this.isim ="bilgi yok"; //bu şekilde diyebiliriz.
        this.email="bilgi yok";

         */
        this("bilgi yok",0.0,"bilgi yok","bilgi yok","bilgi yok");
        //bu şekilde de yazabiliriz tek satırda
    }

    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public Account(String isim, String email, String telefonNo) {
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public void paraYatır(double miktar){
        bakiye+=miktar;
        System.out.println("yeni bakiye="+bakiye);

    }
    public void paraCek(double miktar){
        if (miktar>1500){
            System.out.println("bir günde çekilen tutar 1500 tl'den büyük olamaz");
        }if(bakiye-miktar<0){
            System.out.println("YETERSİZ BAKİYE!!--BAKİYE:"+bakiye);
        }
        else {
            bakiye-=miktar;
            System.out.println("YENİ BAKİYE: "+bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo(String s) {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    public void bilgileriYazdır(){
        System.out.println("hesap no: "+hesapNo +"\nbakiye: "+bakiye + "\nisim : "+ isim + "\nemail : " +email + "bakiye : "+bakiye);
    }
}
