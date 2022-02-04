package Bolum3.Loops;

public class WhileLoop2 {
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
        int i = 0;

        int totalFriends = friends.length;

        while (i<totalFriends){
            if(friends[i] != null && !friends[i].equals("YASİN")){ //array ın içi boş değilse(tanımlanmışsa) veya array'ın içinde YASİN yoksa
                System.out.println("I love " + friends[i]);
            }

            i++;

        }




    }
}
