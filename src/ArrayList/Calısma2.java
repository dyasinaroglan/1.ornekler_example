package ArrayList;

public class Calısma2 {
    public static void main(String[] args) {

        /*
         aaabbbfffgggtttddd  bu sekilde yazilmis bir kelimeyi düzenleyecek bir metot yazin.
         ciktisi bu sekilde olacaktir -> 3a3b3f3g3t4d
         */

        System.out.println(düzenlenmiş("aaabbbfffgggtttddd"));



    }
    public static String düzenlenmiş(String str) {
        String yeniHal = "";
        String[] array = str.split("");
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            String harf = String.valueOf(str.charAt(i));

            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].contains(array[j])) {
                    count++;
                }
            }
            if (!yeniHal.contains(harf)) {
                yeniHal += count + harf;

            }

        }
        return yeniHal;
    }
}
