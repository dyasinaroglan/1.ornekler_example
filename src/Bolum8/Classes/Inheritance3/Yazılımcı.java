package Bolum8.Classes.Inheritance3;

import java.util.Scanner;

public class Yazılımcı extends Calısan{
    private String diller;
    public Yazılımcı(String name, String soyad, int ID,String diller) {
        super(name, soyad, ID);
        this.diller = diller;
    }
    public void formatAt(String isletimSistem){
        System.out.println(getName() + " "+ isletimSistem + "ni yüklüyor.");
    }
    public void bilgileriGöster(){
        super.bilgileriGöster();
        System.out.println("yazılımcının bildiği diller : "+ diller);
    }
    public void yazılımcıİslemleri(){
        Scanner scanner = new Scanner(System.in);
        Yonetici yonetici = new Yonetici("AHMET","KEMİLE",1,12);

        while (true) {
            String menu = "1.Format at\n" +
                    "2.yazılımcı bilgilerini göster\n" +
                    "3.Yazılımcı menüsünden Çıkıs yapınız";
            System.out.println(menu);
            System.out.println("işlem seçiniz");
            int islem = scanner.nextInt();
        switch (islem) {
                case 1:
                    System.out.println("işletim sistemine girilip,format atıldı.");
                    break;
                case 2:
                    bilgileriGöster();
                    break;
                case 3 :
                    System.out.println("yazılımcı menüsünden çıkış yapılıyor...");
                    break;
            }

        }



    }
    public void yazılımMenu(){
        String menu = "1.Format at\n"+
                      "2.yazılımcı bilgilerini göster\n" +
                      "3.Yazılımcı menüsünden Çıkıs yapınız";
        System.out.println(menu);
    }
}
