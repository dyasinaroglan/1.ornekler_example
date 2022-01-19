package Classes.Exception;

import java.util.Scanner;

public class OrnekSoru1 {
    public static void main(String[] args) {
        /*
        kullanicidan bir String alacaz. Hatasiz girimesini saglayalim.
        String girene kadar okutma islemi devam edecek

     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime giriniz");


        while (true){
            try {
                scanner.nextLine();
                break;
            }catch (Exception e){
                System.out.println("kelime giriniz");
              scanner.nextInt();
            }
        }
    }
}
