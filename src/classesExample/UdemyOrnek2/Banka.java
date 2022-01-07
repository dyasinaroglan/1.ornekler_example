package classesExample.UdemyOrnek2;

public class Banka {

    int hesapNo;  //static yapamam çünkü herkese ayrı ayrı hesap no olması lazım. class a ait değil nesneye ait.
   int kasaBakiyesi;
   static int tümHesapBakiyesi;
  private static int toplamHesap=0; //bunlar static yani sınıfa özgü dolayısıyla sıfırlanmayacak çalışmaya devam edeceklerdir.
    static int operasyonSayısı=0;




    public Banka(int hesapNo, int kasaBakiyesi) {
        this.hesapNo = hesapNo;
        this.kasaBakiyesi = kasaBakiyesi;
        tümHesapBakiyesi+=kasaBakiyesi;

        toplamHesap++;

    }

    public int paraYatır(int yatırılanPara){
        kasaBakiyesi+=yatırılanPara;
        operasyonSayısı++;
        return kasaBakiyesi;
    }
    public int paraCek( int cekilenPara){
        if(kasaBakiyesi>= cekilenPara) {

            kasaBakiyesi -= cekilenPara;
            operasyonSayısı++;
        }else {
            System.out.println("kasa bakiyesi YETERSİZ!");
        }
        return kasaBakiyesi;
    }

    public int getKasaBakiyesi() {
        return kasaBakiyesi;
    }
    public static void bankaÖzet(){
        System.out.println("toplam hesap sayısı:"+toplamHesap+"\ntoplam hesap bakiyesi:"+tümHesapBakiyesi+"\ntoplam yapılan işlem sayısı:"+operasyonSayısı);
    }
}
