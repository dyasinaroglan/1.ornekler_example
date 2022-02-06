package Bolum8.Classes.Encapsulation1;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("HARRY POTTER","ROWLİNG","KODLAMA VAKTİ",400);

        //ben bunu bu şekilde yazabilirim. ancak kitap eksi sayı da olabilir mi? OLAMAZ.
        //book class ında sayfa sayısı değişkenine if ile müdahale edebiliriz.

       // System.out.println(b1.numberOfPage); private olduğunda numberOfPage; bu şekilde çağırıp yazdıramam.
        //ancak aynı class içinde methot yazıp çağırabilirim.

        b1.getPageNumber();

        //encapsulation mantığı bu biz numberOfPage i private ile koruma altına aldık. sarmaladık.
        //private farklı class larda çalıştırılmaz.ancak methot yazarak ulaşabiliriz.
        System.out.println(b1.getAuthor());
        System.out.println(b1.getAdı());
        System.out.println(b1.getPublisher());

        b1.setNumberOfPage(-467);
        b1.setNumberOfPage(550);
        b1.setAuthor("yasin"); //yazarın ismi yanlış yazıldı. eksik yazıldı.
        //direkt b1 nesnesini yazdığımızda setler çnümüze gelir ve değişiklik yapabiliriz.
        System.out.println(b1.getAdı());
        System.out.println(b1.getAuthor());
        System.out.println("******************");
        System.out.println("******************");
        System.out.println(b1);

        //encapsulation--> bir sınıfa ait veriables ların sadece o sınıfa ait methotlarla veya oluşturulan
        //constructor içerisinde değiştirilmesi demektir.
        //yanlış girmeyi önleme amacıyla koruma altına alıyoruz. private burada bize yardımcı oluyor.


    }
}
