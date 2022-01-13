package Classes.Enum.Enum1;

public enum Aylar {
    OCAK, ŞUBAT, MART, NİSAN, MAYIS, HAZİRAN, TEMMUZ, AĞUSTOS, EYLÜL, EKİM, KASIM, ARALIK ;

    //ASLINDA STATTİC CLASS BU ENUM LAR.

    public int compareTo() {
        return compareTo(Aylar.MAYIS);
    }

}
