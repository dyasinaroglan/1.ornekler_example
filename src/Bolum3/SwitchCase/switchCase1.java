package Bolum3.SwitchCase;

import java.util.Scanner;

public class switchCase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("haftanın günü ve numarası");
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("PAZARTESİ");
                break;
            case 2 :
                System.out.println("SALI");
                break;
            case 3 :
                System.out.println("ÇARŞAMBA");
                break;
            case 4 :
                System.out.println("PERŞEMBE");
                break;
            case 5 :
                System.out.println("CUMA");
                break;
            case 6 :
                System.out.println("CUMARTESİ");
                break;
            case 7 :
                System.out.println("PAZAR");
                break;
            default:
                System.out.println("GEÇERSİZ TARİH");
        }



    }
}
