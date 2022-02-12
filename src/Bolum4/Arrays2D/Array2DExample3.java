package Bolum4.Arrays2D;

public class Array2DExample3 {
    public static void main(String[] args) {
        /*
        soru 2:
        Bir gazetede calisiyorunuz. Köse yazilarinin birinde 3. cümlenin sonunda "java"
        kelimesi eksik yazilmis. Bu hatayi düzeltecek bir program yazin.

        örnek köse yazisi su sekildedir:

        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum.
        Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi.
        Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.

         */
        String köseYazısı = "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. " +
                "Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzere" +
                " bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır. " +
                "Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır. " +
                "1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile " +
                "ve yakın zamanda Aldus PageMaker gibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";


        String[] cümeleler = köseYazısı.split("\\.");  //noktayı gördün mü ayır
        String düzenlenmis = "";
        cümeleler[2]+= " java"; //cümlenin 3 noktasında sonuna java ekle
        for (int i = 0; i < cümeleler.length; i++) {
            düzenlenmis+= cümeleler[i] + ".";
        }
        System.out.println(düzenlenmis);
        }
    }

