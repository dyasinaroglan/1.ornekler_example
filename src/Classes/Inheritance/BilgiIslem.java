package Classes.Inheritance;

public class BilgiIslem extends Memurlar{

    String gorev;

    public BilgiIslem(String adSoyad, int telefon, String eposta, String departmant, String mesai,String gorev) {
        super(adSoyad, telefon, eposta, departmant, mesai);
        this.gorev = gorev;
    }
}
