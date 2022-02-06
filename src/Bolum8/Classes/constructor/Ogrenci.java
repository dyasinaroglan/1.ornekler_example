package Bolum8.Classes.constructor;

public class Ogrenci {
    String name;
    String surname;
    int number;
    int classroom;
    boolean aktif;

    public void ogrenciBilgileri(String name, String surname, int number, int classroom) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.classroom = classroom;
    }
    public Ogrenci(){
        aktif=true;
        name="isim verilmemiş";
        surname="soyisim verilmemiş";
        classroom= 0000000000;

    }
    public Ogrenci(String name,String surname,int number, boolean aktif,int classroom){
        this.name=name;
        this.surname=surname;
        this.aktif=aktif;
        this.classroom=classroom;

    }
    public Ogrenci(int number,String name,boolean aktif){
       this.name=name;
       this.number=number;
       this.aktif=aktif;
    }



    public void yazdır() {
        if (aktif) {
            System.out.println("öğrencinin adı:" + name + "\nöğrencinin soyadı:" + surname + "\nnumarası:" + number + "\nsınıfı:" + classroom);
        } else {
            System.out.println("öğrenci aktif değildir.");
        }
    }
}
