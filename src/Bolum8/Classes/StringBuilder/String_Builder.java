package Bolum8.Classes.StringBuilder;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("JAVA DÜNYASI");
        builder.append(12);
        System.out.println(builder);
        builder.insert(3,"XX"); //3.indisten sonra XX araya koy
        System.out.println(builder);
        builder.replace(3,9,"STR"); //3 ile 9 arası. str yaz. str yi yazdıktan sonra 9 a kadar ki (9 dahil değil) olan kısmı alma
        System.out.println(builder);

    }
}
