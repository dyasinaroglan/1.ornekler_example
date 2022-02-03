package Bolum3.SwitchCase;

import java.util.Scanner;

public class SwitchCase7ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        int select;
        int balance = 1500;
        int right = 3;
        boolean durum = true;

        System.out.println("************************");
        System.out.println("***BANKAMIZA HOŞGELDİNİZ***");
        System.out.println("*************************");

        System.out.println("kullanıcı adınızı girin");
        username = scanner.nextLine();
        System.out.println("şifrenizi girin");
        password = scanner.nextLine();

            if (username.equals("yasin") && password.equals("264264")) {
                System.out.println("giriş işlemi başarılı şekilde gerçekleşmiştir...");

                while (right>0) {
                    if (username.equals("yasin") && password.equals("264264")) {
                        System.out.println("Yapmak istediğiniz işlemi seçiniz\n" +
                                "1.PARA YATIRMA\n" +
                                "2.PARA ÇEKME\n" +
                                "3.BAKİYE SORGULAMA\n" +
                                "4.ÇIKIŞ");
                        select = scanner.nextInt();
                        durum = true;
                        while (durum) {
                            switch (select) {
                                case 1:
                                    System.out.println("yatırmak istediğiniz tutarı giriniz");
                                    int mount = scanner.nextInt();
                                    balance += mount;
                                    System.out.println("yeni bakiyeniz = " + balance);
                                    break;
                                case 2:
                                    System.out.println("çekmek istediğiniz tutarı giriniz");
                                    int cekilenMiktar = scanner.nextInt();
                                    if (balance > cekilenMiktar) {
                                        balance -= cekilenMiktar;
                                        System.out.println("yeni bakiyeniz = " + balance);
                                    } else {
                                        System.out.println("BAKİYE YETERSİZ");
                                    }
                                    break;
                                case 3:
                                    System.out.println("güncel bakiyeniz = " + balance);
                                    break;
                                case 4:
                                    System.out.println("bankamızı tercih ettiğiniz için teşekkür ederiz");
                                    break;
                            }
                            durum = false;
                        }
                    }
                }
            }
            else {
                right--;

                if (right == 0) {
                    System.out.println("şifreniz bloke oldu");
                } else {
                    System.out.println("yanlış giriş yaptınız lütfen tekrar deneyiniz");
                    System.out.println("kalan hakkınız : " + right);
                }
            }
        }
    }







