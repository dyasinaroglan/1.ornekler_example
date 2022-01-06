package classesExample.task2;

public class Main {
    public static void main(String[] args) {
        /*
    Bir banka class'ı tanımlayınız. Veri kontrollerini ilgili yerlerde yapınız.
    1.	3 adet field ekleyiniz. (id, subeAdi, kasaBakiyesi)
    2.	initialize için 2 adet constructor kullanın.
	3.	paraYatir(int yatirilacakPara); methodu ile bankaya para yatırın.
	4.	paraCek();	methodu ile bankaya para çekin.
	    getBakiye()
    5.	Banka bilgilerini ekrana yazdıracak metodu oluşturun.
        (Şube : Xbank, bakiye : xxx.xx TL)(toString)
	6.	main'de 2 tane banka oluşturup para yatırma ve çekme işlemleri yapın
	7.	olusturdugunuz iki banka arasinda para transferi yapin. (Çözüm düşüneniz nedir)
     */

        Banka garanti =new Banka(1,"MALTEPE");
        garanti.kasaBakiyesi=1500;
        Banka ziraat = new Banka(2,"KADIKÖY",1000);
        Banka deniz = new Banka(3,"ÜSKÜDAR",-1000);

        System.out.println(garanti.paraCek(300));
        System.out.println(ziraat.paraYatır(500));
        System.out.println("--------------------------------");
        System.out.println(garanti.kasaBakiyesi);
        System.out.println(ziraat.subeAdı);
        deniz.paraYatır(500);
        System.out.println("-----------------------");

        System.out.println(deniz.toString());
        paraTransfer(100,garanti,ziraat);
        System.out.println(garanti.getBakiye());
        System.out.println(ziraat.getBakiye());
        System.out.println("-------------------------");
        paraTransfer(100000,garanti,ziraat);
        System.out.println(ziraat.getBakiye());
        System.out.println(garanti.getBakiye());

    }
    public static void paraTransfer(int havaleMiktarı, Banka ödeyecekBanka,Banka alacakBanka){
        if(ödeyecekBanka.paraCek(havaleMiktarı));
        alacakBanka.paraYatır(havaleMiktarı);



    }
}
