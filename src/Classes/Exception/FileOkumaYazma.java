package Classes.Exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOkumaYazma {

    public static void main(String[] args) throws IOException {
        dosyaYaz("info.txt");

        String dosyaAdı = "info.txt1";
        FileWriter fileWriter1 = new FileWriter(dosyaAdı);
        fileWriter1.write("heyy merhaba");
        fileWriter1.close();


    }
    public static void dosyaYaz(String dosyaAdı) throws IOException {
        FileWriter fileWriter = new FileWriter(dosyaAdı);
        fileWriter.append("sd").write("java dünyasına hoşgeldiniz. ");
        fileWriter.write("umarım bu yolda başarılı olursunuz");
        fileWriter.close();
    }
    public static void dosyaOku(String dosyaAdı) throws IOException {
        FileReader fileReader = new FileReader(dosyaAdı);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){  //hasNextLine satır var mı yok mu bakar. varsa scanner.nextLine ile okur.
            //satırda bir şey yazmasına gerek yok.
            //hasNextLine-->  satır satır okur. hasNext--> kelime kelime okur.
            scanner.nextLine();
        }
        scanner.close();
        fileReader.close();
    }
}
