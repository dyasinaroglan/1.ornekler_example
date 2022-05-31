package algoritma;

public class _06Examp {
    public static void main(String[] args) {

        //Bir dizide ki aynı elemanları temizleyerek Tekrarsız bir program yazınız.
        //Örnek: "aaabbbccc" -> "abc"
        //Örnek: "aaabbbccca" -> "abc"

        String str = "aaabbbccc";
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            if(!newString.contains(str.charAt(i)+ "")){
                newString+= str.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
