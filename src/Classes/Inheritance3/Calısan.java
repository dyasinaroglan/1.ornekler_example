package Classes.Inheritance3;

public class Calısan {
    private String name;
    private String soyad;
    private int ID;

    public Calısan(String name, String soyad, int ID) {
        this.name = name;
        this.soyad = soyad;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void bilgileriGöster(){
        System.out.println("***ÇALIŞAN BİLGİLERİ***");
        System.out.println("ad : "+ name);
        System.out.println("soyad : "+ soyad);
        System.out.println("İD : "+ ID);
    }
}
