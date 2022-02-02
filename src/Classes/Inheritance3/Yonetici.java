package Classes.Inheritance3;

public class Yonetici extends Calısan{

    private int sorumluKisiSayısı;

    public Yonetici(String name, String soyad, int ID,int sorumluKisiSayısı) {
        super(name, soyad, ID);
        this.sorumluKisiSayısı=sorumluKisiSayısı;
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println(this.getName()+ " adlı yöneticimizin sorumlu olduğu kişi sayısı : "+ sorumluKisiSayısı);
    }
    public void zamYap(int miktar){
        System.out.println(getName()+ " çalışanlara "+ miktar +" TL zam yapıyor.");
    }

}
