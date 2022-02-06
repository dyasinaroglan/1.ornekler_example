package Bolum8.Classes.Inheritance1;

public class Calısan {  //superClass - BaseClass

    private String isim;
    private  int maas;
    private String department;

    public Calısan(String isim, int maaas, String department) {
        this.isim = isim;
        this.maas = maaas;
        this.department = department;
    }
    public void calıs(){
        System.out.println("çalışıyorum");
    }
    public void bilgileriGöster(){
        System.out.println("isim : "+ isim + "\nmaaş : "+ maas + "\ndepartmant : "+ department);
    }
    public void departmanDegistir(String departman){
        System.out.println("departman değiştiriliyor..!");
        this.department = department;

        System.out.println("yeni departman : "+ this.department);

    }
    public void zamYap(int zamMiktarı){
        System.out.println("çalışanlara "+ zamMiktarı +" zam yapıldı.");

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
