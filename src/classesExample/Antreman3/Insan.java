package classesExample.Antreman3;

public class Insan {
    String adi;
    int yasi;
    Insan baba;
    Insan anne;

    public void veriAta(String adi,int yasi){
        this.adi = adi;
        this.yasi = yasi;
    }

    public void anneAta(Insan anne){
        this.anne = anne;
    }
    public void babaAta(Insan baba){
        this.baba = baba;
    }
    public void senKımsın(){
        System.out.println("adım "+ adi+ ","+ " yaşı "+ yasi+ " yaşında");
    }
    public void anneKim(){
        System.out.println("adı : "+ anne.adi + " yaşı : "+ anne.yasi+ " yaiında");
    }
    public void babanKim(){
        System.out.println("Babamin adi " + baba.adi + " ve " + baba.yasi + " yasinda");
    }
    public void annenKim(){
        System.out.println("annemin adı "+ anne.adi+ " ve "+ anne.yasi+ " yaşında");
    }
}
