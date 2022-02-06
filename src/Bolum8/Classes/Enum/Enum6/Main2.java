package Bolum8.Classes.Enum.Enum6;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //kullanıcıdan gun adı girmesini isteyin. girdiği günün günler enumundaki ordinal değerini bulun.

        Gunler gun1 = Gunler.PAZAR;

        Scanner scanner = new Scanner(System.in);
        System.out.println("gün giriniz");
        String gun = scanner.nextLine().trim().toUpperCase(Locale.ROOT);

        System.out.println(Gunler.valueOf(gun).ordinal()+1);



    }
}










enum Gunler{

    PAZARTESİ,SALI,ÇARŞAMBA,PERŞEMBE,CUMA,CUMARTESİ,PAZAR;




}
