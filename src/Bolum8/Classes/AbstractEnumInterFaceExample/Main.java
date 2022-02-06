package Bolum8.Classes.AbstractEnumInterFaceExample;

public class Main {
    public static void main(String[] args) {

        Banka1 b1 = new Banka1("İŞ BANKASI",BankaTuru.KATILIM,2500,"İSTANBUL",0.12);
        Banka1 b2 = new Banka1("AKBANK",BankaTuru.NORMAL,3500,"İZMİR",0.15);
        Banka2 b3 = new Banka2("ZİRAAT",BankaTuru.NORMAL,2000,10, 0.09);

        b1.paraYatır(100);
        b1.paraCek(50);
        b1.faizEkle();
        System.out.println(b1.kasaToplamı());
    }
}
