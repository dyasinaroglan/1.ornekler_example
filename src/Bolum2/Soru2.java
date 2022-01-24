package Bolum2;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*
        küçük bir piyango oyunu tasarlayınız. sistem iki basamaklı bir sayı üretmeli.
        kullanıcıdan da bu sayıyı tahmin etmesini istemelisiniz.
        eğer kullanıcı sayıyı tam olarak doğru bilirse 10000 tl,
        eğer kullanıcı sayının basamaklarını bilirse yani 65 yerine 56 yazmışsa 5000 tl
        eğer kullanıcı numaranın sadece bir basamağını bilirse 1000 tl kazanır.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki basamaklı sayıyı giriniz");
        int sayı = scanner.nextInt();
        int sanslıSayı = (int) (Math.random() * 99 + 1);

        int birinciBasamak = sanslıSayı / 10; //birler basamağı
        int ikinciBasamak = sanslıSayı % 10; //ikinci basamak
        int üretilenSayınınBirinciBasamagı = sayı / 10;
        int üretilenSayınınİkinciBasamagı = sayı % 10;

        if (sayı == sanslıSayı) {
            System.out.println("TEBRİKLER!!! 10.000 TL KAZANDINIZ\n" + "şanslı sayı = "+ sanslıSayı);
        } else if (üretilenSayınınBirinciBasamagı == ikinciBasamak && üretilenSayınınİkinciBasamagı == birinciBasamak) {
            System.out.println("TEBRİKLER!!! 5.000 TL KAZANDINIZ\n" + "şanslı sayı = "+ sanslıSayı);
        } else if (üretilenSayınınBirinciBasamagı == ikinciBasamak || üretilenSayınınBirinciBasamagı == birinciBasamak ||
                üretilenSayınınİkinciBasamagı == birinciBasamak || üretilenSayınınİkinciBasamagı == ikinciBasamak) {
            System.out.println("TEBRİKLER 1.000 TL KAZANDINIZ\n" + "şanslı sayı = "+ sanslıSayı);
        }else {
            System.out.println("KAZANAMADINIZ" + "şanslı sayı\n = "+ sanslıSayı);
        }
    }
}

