package Bolum4.Arrays;

import java.util.Scanner;

public class ArrayExample7 {
    public static void main(String[] args) {

        /*
             3 karakterlik bir dizi okuyan bir program yazın,
             ve kaç ünsüz okunduğunu söyleyin.
             Ünsüzleri yazdırın.
        */
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[3];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);

    }

}

