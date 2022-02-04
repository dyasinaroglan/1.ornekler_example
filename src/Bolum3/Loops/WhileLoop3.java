package Bolum3.Loops;

public class WhileLoop3 {
    public static void main(String[] args) {

        String[] friends = new String[20];

        friends[0] = "MATİLDA";
        friends[1] = "JOHN";
        friends[2] = "YASİN";
        friends[3] = "ROSA";
        friends[4] = "RUKİYE";
        friends[15] = "STEVE";
        friends[16] = "MASHA";
        friends[17] = "NATASHA";
        int totalFriends = friends.length;
        int i = 0;
        while (i<totalFriends) {
            if (friends[i] == null) { //boş olanları yani tanımlanmamış indisleri bak geç. bekleme yapma.
                i++;
                continue;
            }
            System.out.println("MY FRİENDS : "+ friends[i]);
            i++;
        }
    }
}
