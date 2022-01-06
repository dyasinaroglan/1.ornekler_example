package Classes.ClassCalısmaMantık;

public class Arac {
    String name;//instance veriables
    int nesneCount=1;
    static int count=2;  //class static veriables.

    //STATİC İNİTİALİZER  başlatıcı
    //SADECE SÜSLÜ PARANTEZDEN OLUŞUR.
    static {

        System.out.println("static initializer çalıştı.count"+count);
        count++;
    } //count 10 yaptığımzda bunu okur.
    //İNSTANCE İNİTİALİZER

    {

        System.out.println("instance initializer çalıştı.nesneCount="+nesneCount);
        nesneCount++;
    }
      //CONSTRUCTOR NEW yapıldığında otomatik çalışır.
    public Arac(String name) {
        System.out.println("constructor çalıştı.nesneCount="+nesneCount);
        this.name = name;
        nesneCount++;

    }

    //class ı tetikleyici unsur. çalışması lazım
    public static void main(String[] args) {
        System.out.println("main başladı.count="+count); //buradan şunu anlıyoruz main e gelmeden önce
        //static countu okuyor. İNSTANCE VERİABLE OKUMAZ. ONUN İÇİN NEW OLUŞTURMAMIZ LAZIM

        Arac a1 = new Arac("AUDİ");
        System.out.println("nesne oluştu.nesneCount="+a1.nesneCount);
        System.out.println("main bitti");
    }
}




/*
MAİN çalıştığında
1.İLK STATİC VERİABLES ı okur.
2.STATİC İNİTİALİZER varsa çalıştırılır.
3.MAİN başlatılır.
NEW oluşturulmadan İNSTANCE VERİABLES lar okunmaz. NEW lazım.

NEW yaparsak
4.İNSTANCE VERİABLES okunur.
5.İNSTANCE İNİTİALİZER İ ÇALIŞTIRIR.
6.CONSTRUCTOR ÇALIŞTIRIR.(Yani nesne creat edilir)

initializer dediğimiz süslü parantez olan

not1) METHOD İÇERİSİNDE java YUKARIDAN AŞAĞIYA OKUR.
NOT2) Eğer CLASS içinde İNİTİLİAZER var ise İNİTİLİAZER içinde kullanılacak veriables lar inteliazelerden önce tanımlanmalı.
aksi takdirde instance ve class veriables ların tanımlama yeri farketmez.
ancak prensip olarak en üstte tanımlanır

NOT3) methotların oluşturulma sırası önemli değildir.
NOT4) methot içi yukarıdan başlamak üzere aşağı doğru yürütülür. dolayısıyla tanımlamaların sırası önemlidir.
 */
