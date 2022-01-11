package classesExample.CalısmaUdemyATM;

public class Hesap {
    private String kullanıcıAdı;
    private int bakiye;
    private String parola;

    public Hesap(String kullanıcıAdı, int bakiye, String parola) {
        this.kullanıcıAdı = kullanıcıAdı;
        this.bakiye = bakiye;
        this.parola = parola;
    }

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }


    public void paraYatır(int miktar ){
        bakiye+=miktar;
        System.out.println("Güncel Bakiye ="+bakiye);

    }
    public void paraCek(int miktar){
        if(bakiye<miktar){
            System.out.println("BAKİYE YETERSİZ");
        }else {
            bakiye-=miktar;
            System.out.println("Güncel Bakiye ="+bakiye);
        }
    }

}
