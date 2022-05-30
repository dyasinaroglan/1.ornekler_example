package algoritma;

import java.util.Scanner;

public class _02Examp {
    public static void main(String[] args) {
        //String ifadeyi ifadeyi tersten yazdıran program

        String ifade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("String ifadeyi tersten yazdıran program\n");
        System.out.print("Lütfen bir ifade giriniz: ");
        ifade = scanner.nextLine();

        for (int i = ifade.length()-1; i >= 0 ; i--) {   //index saymaya 0 dan başladığı için -1 yapılıyor. Fakat length 1 den sayılıyor.
            System.out.print(ifade.charAt(i));
        }
    }
}
