package Classes.Enum.Enum1;

public class Main {
    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;


        System.out.println(ay);
        System.out.println(ay.name());
        System.out.println(ay.ordinal()+1); // kaçıncı sırada olduğunu gösteriyor. indis

        System.out.println(ay.compareTo());

        switch (ay){
            case OCAK :
                System.out.println(31);
                break;
            case ŞUBAT:
                System.out.println(28); break;
            case MART:
                System.out.println(31); break;
            case NİSAN:
                System.out.println(30); break;
            case MAYIS:
                System.out.println(31); break;
            case HAZİRAN:
                System.out.println(30); break;
            case TEMMUZ:
                System.out.println(31); break;
            case AĞUSTOS:
                System.out.println(30); break;
            case EYLÜL:
                System.out.println(31); break;
            case EKİM:
                System.out.println(30); break;
            case KASIM:
                System.out.println(31); break;
            case ARALIK:
                System.out.println(31); break;
        }
        System.out.println(Aylar.AĞUSTOS);

    }


}
