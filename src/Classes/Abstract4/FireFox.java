package Classes.Abstract4;

public class FireFox extends Driver{

    public FireFox(String isim) {
        super(isim);
    }

    @Override
    public String getDriver() {
        return "FireFox";
    }
}
