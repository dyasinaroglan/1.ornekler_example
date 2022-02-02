package Classes.Inheritance3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("çalışanlar programına hoşgeldiniz");
        String islemler = "***islemler***\n" +
                          "1.yazılımcı işemleri\n"+
                          "2.yönetici isşlemelri\n"+
                          "3.çıkış için q'ya basınız";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");

        while (true){
            System.out.println("işlemi seçiniz");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("programdan çıkılıyor");
                break;
            }else if (islem.equals("1")){
                Yazılımcı yazılımcı = new Yazılımcı("AHMET","SOYAD",2,"JAVA,HTML");
                String yazılımcıİslem = "1.format at\n"+
                                        "2.yazılımcı bilgilerini göster\n" +
                                        "3.çıkış için q ya basınız";
                System.out.println(yazılımcıİslem);
                while (true){
                    System.out.println("işlemi seçiniz");
                    String yİslem = scanner.nextLine();
                    if(yİslem.equals("q")){
                        System.out.println("yazılımcı işlemlerinden çıkılıyor");
                        break;
                    }else if (yİslem.equals("1")){
                        System.out.println("işletim sistemi :");
                        String isletimSistemi = scanner.nextLine();
                        yazılımcı.formatAt(isletimSistemi);
                    }else if (yİslem.equals("2")){
                        yazılımcı.bilgileriGöster();
                    }else {
                        System.out.println("geçersiz yazılımcı işlemi");
                    }

                }

            }else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("SERHAT","ULU",5,15);
                String yöneticiİslem = "yönetici işlemleri\n"+
                                       "1.zam yap\n"+
                                       "2.bilgileri göster"+
                                       "3.çıkış yapmak için q ya basınız";
                System.out.println(yöneticiİslem);
                while (true){
                    System.out.println("işlem seçiniz");
                    String yİslem = scanner.nextLine();
                    if(yİslem.equals("q")){
                        System.out.println("yönetici işlemlerinden çıkılıyor");
                        break;
                    }else if(yİslem.equals("1")){
                        System.out.println("yöneticinin ne kadar zam yapmasını istiyorsunuz");
                        int zamMiktar = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktar);
                    }else if(yİslem.equals("2")){
                        yonetici.bilgileriGöster();
                    }else {
                        System.out.println("geçersiz yönetici işlemi");
                    }
                }
            }
            else {
                System.out.println("geçersiz işlem....");
            }
        }
    }
}
