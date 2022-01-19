package Classes.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {  //java dışında işlemler varsa, dosya işlemleri,sistem işlemleri varsa uyarır.

    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("d:/x.tct");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //senin d:/x.tct adında bir dosyan var. ama yoksa hata oluşabilir diyor.
        //bunu try-catch e alman lazım. yani javanın dışarı ile bağlantısı varsa,dışarıdan veri alma durumu varsa
        //hata üretibelme durumuna karşı bizi uyarıyor.
    }
    public void getFile(String dosyaAdı) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(dosyaAdı); //bu methoda exception gönder.
        //sadece try-catch e al seçeneğimiz yok. methoda exception da gönderebiliriz.
    }
    public void getFile2 (String dosyaAdı){
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaAdı);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void method1() throws FileNotFoundException {
        getFile("file");
        //methodu kullansakta try-catch içinde kullanmalı. yada exception throw etmelidir.
    }
    public void method2(){
        getFile2("asdsad"); //bunda hata vermedi. neden bu getFile2 methodu zaten try-catche atıldı.
        //gerek yok artık düzeltmeye. hatayı bir şekilde try catch e atıp işlem yapmak zorundayım.

        //TRY-CATCH e alınmayan checked exceptionlar exception THROW edilmelidir!!!
        //TRY-CATCH içine alınan exceptionlar exception throw etmezler.
    }
}
