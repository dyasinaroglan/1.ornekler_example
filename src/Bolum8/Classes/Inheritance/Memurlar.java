package Bolum8.Classes.Inheritance;

public class Memurlar extends Calısan{

    String departmant;
    String mesai;

    public Memurlar(String adSoyad, int telefon, String eposta, String departmant, String mesai) {
        super(adSoyad, telefon, eposta);
        //super nedir? parentclass daki veriables ların çağırılması olayı.
        this.departmant = departmant;
        this.mesai = mesai;
    }

    public String getDepartmant() {
        return departmant;
    }

    public String getMesai() {
        return mesai;
    }
}
