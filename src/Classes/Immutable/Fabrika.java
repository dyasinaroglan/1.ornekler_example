package Classes.Immutable;

public class Fabrika {
    public static void main(String[] args) {
        String[] üreticiFirmaşar={"casper","lenovo","HP"};
        Bilgisayar b1 = new Bilgisayar(8,512,üreticiFirmaşar); //ya da new String[]{"casper","lenovo","HP"}; yazabiliriz
        String[] firma = b1.getÜreticiFirmalar();
        firma[0]="apple";

        bilgisayarYazdır(b1);



    }
    public static void bilgisayarYazdır(Bilgisayar pcYazdır){
        System.out.println("çekirdek sayısı = "+ pcYazdır.getCekirdekSayısı()+"\nram = "+pcYazdır.getRam()+"\nüretici firma = "+ pcYazdır.getÜreticiFirmalar()[0]);
    }
}
