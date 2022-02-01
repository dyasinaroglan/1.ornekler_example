package Classes.Inheritance1;

public class Yonetici extends Calısan{ //EXTEND ederek Calısan sınıfındaki tüm özellikleri miras gibi almış oluyoruz.

    private int sorumluKisi;

    public Yonetici(String isim, int maas, String department,int sorumluKisi) {
        super(isim,maas,department);//super--baseClass ın özellikleri buraya kalıtım yoluyla geldiği için super.
        this.sorumluKisi = sorumluKisi;

        //this kendi class ımızdaki nesneleri temsil ediyor.
        //super ise miras aldığım clas ın constructor un özelliklerini temsil ediyor.

        //yöneticinin ekstra özellikleri olabilir. o zaman this

    }
    /*public void bilgileriGöster(){
        System.out.println("isim : "+ isim + "\nmaaş : "+ maas + "\ndepartmant : "+ department);
    }
    bu şekilde Calısan sınıfındaki bir methoda ulaşamıyoruz. işte bunu getter ve setter ile çözüyoruz.
     */

    public void bilgileriGöster(){
        System.out.println("isim : "+ getIsim() + "\nmaaş : "+ getMaas() + "\ndepartmant : "+ getDepartment());

        //bu şekilde getter ile bunları çağırabiliyoruz.

        System.out.println("sorumlu kişi sayısı = "+ this.sorumluKisi);
        //veriables eğer extend edildiyse class lar bu şekilde çağırabiliyoruz
    }
}
