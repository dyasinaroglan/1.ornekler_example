package Classes.Encapsulation;

public class Fabrika {
    public static void main(String[] args) {
        Televizyon tv1 = new Televizyon();
        tv1.ac();
        tv1.setKanal(245);
        tv1.getSesSeviyesi(15);
        tv1.kapat();
        tv1.yazdır();




    }
}
