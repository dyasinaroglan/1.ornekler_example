package Bolum8.Classes.Enum.Enum3;

public enum Otomobil {

    OPEL("ALMANYA"),
    FİAT("İTALYA"),
    MERCEDES("ALMANYA"),
    BMW("ALMANYA"),
    FERRARİ("İTALYA"),
    FORD("ABD"),
    MAZDA("FRANSA"),
    TOYOTA("JAPONYA"),
    ;

    private String üretildiğiÜlke;

    Otomobil(String üretildiğiÜlke) {
        this.üretildiğiÜlke = üretildiğiÜlke;
    }

    public String getÜretildiğiÜlke() {
        return üretildiğiÜlke;
    }


    public String toString() {
        return "Otomobil ve Ülkeleri\n"  + "üretildiğiÜlke = " + üretildiğiÜlke ;
    }
}
