package Classes.Inheritance;

public class Guvenlık extends Memurlar{
    String belge;


    public Guvenlık(String adSoyad, int telefon, String eposta, String departmant, String mesai,String belge) {
        super(adSoyad, telefon, eposta, departmant, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
}
