package Bolum8.Classes.Abstract4;

public class Chrome extends Driver{


    public Chrome(String isim) {
        super(isim);
    }

    @Override
    public String getDriver() {
        return "Chrome";
    }
}
