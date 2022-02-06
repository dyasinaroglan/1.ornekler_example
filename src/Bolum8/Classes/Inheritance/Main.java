package Bolum8.Classes.Inheritance;

public class Main {
    public static void main(String[] args) {
        Calısan c = new Calısan("yasin aroglan",5454,"yasinargln@gmail.com");
        c.giris(); //zaten aynı class ta giriş methodu ile c. default methot
       // Akademisyen a = new Akademisyen("mehmet akif",567,"mehemt@gmail.com","kamu yönetimi","ders anlatmak","siyaset bilimi");
        //a.giris(); // normalde akademisyenin içinde giris() methodu yok ama Akademisyen methodu Calısan methodu ile
        //extend edildiği için giris methodunu kullanabilir.
        Memurlar m = new Memurlar("cafer atılgan",454,"cafer@gmail.com","muhasebe","akşam");
        m.giris();
        System.out.println(Calısan.girisSayısı());
        System.out.println(Memurlar.girisSayısı());
        System.out.println(Akademisyen.girisSayısı());

        //c.derseGir(); bunu göremem
       // m.derseGir(); olmaz
        Asistan asistan = new Asistan("kerim duran",322,"kerim@gmail.com","mali hukuk","maliye","vergi hukuku","E");
        asistan.derseGir();
        OgretimUyesi ogretimUyesi = new OgretimUyesi("ahmet beşik",210,"ahmet@gmail.com","işletme","ders anlatmak","işletme hukuku ","prof");
        ogretimUyesi.derseGir();

        System.out.println(ogretimUyesi.getAdSoyad());
        System.out.println(m.getTelefon());
        System.out.println(c);
        ogretimUyesi.giris();
        System.out.println(ogretimUyesi.getAdSoyad());
        System.out.println(ogretimUyesi.getEposta());
        System.out.println(ogretimUyesi);
        ogretimUyesi.giris();

        //Calısan calısan = new Akademisyen("mehmet akif",567,"mehemt@gmail.com","kamu yönetimi","ders anlatmak","siyaset bilimi");
        //Calısan nesnesinden akademisyen ürettim. bunun adı Polymorphism dir.
        //bu calısan akademisyen gibi davranacak. iki sınıftada olan giriş methodunu çalıştırdığımızda akademisyenin methodunu çalıştırır.

        ogretimUyesi.derseGir();
        asistan.derseGir();
        ogretimUyesi.derseGir(5);







    }
}
