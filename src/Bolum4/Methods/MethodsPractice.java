package Bolum4.Methods;

import java.util.Locale;

public class MethodsPractice {
    public static void main(String[] args) {
        initials("yasin","aroglan");
        domain("yasinargln@gmail.com"); //gmail.x
        nameOfMonth(1);

    }
    //1. Create a method that can display the initials of the person.(kişinin baş haraflerini görüntüleyebilecek method)
    public static void initials(String name, String surname){
       String initial = name.toUpperCase(Locale.ROOT).charAt(0)+ "." + surname.toUpperCase(Locale.ROOT).charAt(0);
       //toUpperCse--- küçük harfi büyütür.
        System.out.println(initial);
    }
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        //substring in içinde indexOf ile @ işaretinden başlamak koşuluyla bütün hepsini al ve noktaya kadar.
        System.out.println("domain = " + domain);
    }
    public static void nameOfMonth(int number){
        String name = "";
        if(number>=1 && number<=12){
            name = (number == 1)? "OCAK" : (number == 2)? "ŞUBAT" : (number == 3)? "mart" : (number==4)?"nisan" :
                    (number == 5)? "mayıs" : (number==6)? "haziran" : (number ==7)? "temmuz" :
                            (number==8)? "ağustos" : (number==9)? "eylül" : (number== 10)? "ekim" :
                                    (number == 11)? "kasım" : "aralık";
                    //soru işareti(?) koşulumuz doğruysa anlamına gelir. koşul doğruysa ""string ifadeyi yazarız
            //koşul yanlış ise iki nokta(:) koyarız diğer koşula geçmesini söylemiş oluruz.
            //soru işaretinden sonra "string ifadeyi yazmamız lazım"
        }else {
            name = "GEÇERSİZ";
        }
        System.out.println("month name : " + name);
    }
}
