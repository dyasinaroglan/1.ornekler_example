package Bolum8.Classes.Extends.extend3;

public class Otobüs extends Arac {

    int yolcuKapasitesi;

    public Otobüs(Turu türü, int model, int yolcuKapasitesi) {

        super(türü, model);
        this.yolcuKapasitesi = yolcuKapasitesi;

    }

    //Arac ın constructır ı varsa bu class ın constructor unu çağırmam lazım.
        //boş constructor ı varsa hata vermez.
        //çünkü biz burada arac ın değişkenlerini kullanıyoruz.



        //boş constructor dışında constructor varsa çağırmak zorundayım.
        //boş varsa hiç bir şey create etmeden gönderebiirim.


        //ilk satırda super. olması lazım
}
