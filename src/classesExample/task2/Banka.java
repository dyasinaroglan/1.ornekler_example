package classesExample.task2;

public class Banka {
    int id;
    String subeAdı;
    int kasaBakiyesi;

    public Banka(int id, String subeAdı) {
        this.id = id;
        this.subeAdı = subeAdı;
    }

    public Banka(int id, String subeAdı, int kasaBakiyesi) {
        this(id,subeAdı);
        this.kasaBakiyesi = kasaBakiyesi;
    }
    public boolean paraYatır(int yatırılanPara){
        if(yatırılanPara>0) {
            kasaBakiyesi = kasaBakiyesi + yatırılanPara;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean paraCek(int cekilenPara){
        if(kasaBakiyesi>=cekilenPara){
        kasaBakiyesi= kasaBakiyesi-cekilenPara;
        return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        return "subeAdı= " + subeAdı + "\nkasaBakiyesi= " + kasaBakiyesi ;
    }
    public int getBakiye(){
        return kasaBakiyesi;
    }
}
