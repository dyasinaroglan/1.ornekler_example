package classesExample.CalısmaUdemyATM;

import java.util.Scanner;

public class Login {

    public boolean logIn (Hesap hesap){ //Hesap Class'ından bir hesap değişkeni
        Scanner scanner = new Scanner(System.in);
        System.out.println("kullanıcı adı giriniz");
        String kullanıcıAdı = scanner.nextLine();
        System.out.println("parola giriniz");
        String parola = scanner.nextLine();
        //şimdi burada yukarıda Hesap hesap parametresi ile burada gireceğim kullanıcı adı ve parolanın aynı olmasını istiyorum.
        if (hesap.getKullanıcıAdı().equals(kullanıcıAdı) && hesap.getParola().equals(parola)){
             return true;                    //Hesap class ının içindeki get kullanıcıyı çağırırız.
        }else {
            return false;  // ya kullanıcı adı ya da parolamız yanlıştır.
        }
    }
}
