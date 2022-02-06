package Bolum8.Classes.Exception;

import java.util.Scanner;

public class OrnekSoru {
    public static void main(String[] args) {

         /*
        kullanicidan bir int alacaz. Hatasiz girimesini saglayalim.
        integer girene kadar okutma islemi devam edecek


     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");

        while (true){ //while döngüsünü kullanmamızın nedeni ne kadar gireceğimizin belli olmaması.
            try {
                scanner.nextInt();
                break; //break koymazsak sayı girsekte döngü devam eder. ama biz sayı girince programın sonlanmasını istiyoruz.
            }catch (Exception e){
                System.out.println("sayı giriniz");
                scanner.nextLine();
            }
        }
    }
}
