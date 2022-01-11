package classesExample.CalısmaUdemyATM;

import java.util.Scanner;

public class Atm {

    public void calıs(Hesap hesap){
        Login log1 = new Login(); //login kontrol edeceğimiz için log nesnesi oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ");
        System.out.println("********************");
        System.out.println("KULLANICI GİRİŞİ");
        System.out.println("*********************");

        int girisHakkı =3;
        while (true){
            if(log1.logIn(hesap)){
                System.out.println("GİRİŞ BAŞARILI");
                break;
            }else {
                System.out.println("GİRİŞ BAŞARISIZ");
                girisHakkı--;
                System.out.println("KALAN GİRİŞ HAKKI ="+ girisHakkı);
            }
            if (girisHakkı==0){
                System.out.println("GİRİŞ HAKKINIZ BİTTİ");
                return;
            }
            //burada işlemi doğru bir şekilde tamamladık. artık atm den işlemi yapmamız gerekiyor
        }
        System.out.println("***********************************");
        String islemler = "1.BAKİYE GÖRÜNTÜLE\n"
                + "2.PARA YATIRMA\n"
                + "3.PARA ÇEKME\n"
                + "ÇIKIŞ İÇİN Q'YA BASINIZ";
        System.out.println(islemler);

        System.out.println("***********************************");

        while (true){
            System.out.println("İŞLEM SEÇİNİZ");
            String islem = scanner.nextLine();
            if (islem.equals("Q")){
                break;
            }else if(islem.equals("1")){
                System.out.println("GÜNCEL BAKİYENİZ= "+ hesap.getBakiye());
            }else if(islem.equals("2")){
                System.out.println("YATIRMAK İSTEDİĞİNİZ TUTAR = ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatır(tutar);
            }else if(islem.equals("3")){
                System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTAR");
                int tutar = scanner.nextInt();
                hesap.paraCek(tutar);
            }else {
                System.out.println("GEÇERSİZ İŞLEM");
            }
        }





    }

}
