package algoritma;

public class _05Examp {
    public static void main(String[] args) {
        //İçerisinde string karakterler ile bulunan rakamları sadece rakam şeklinde yazan bir program

        String str = "A1234H56B789";
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){  //char() dizindeki tek bir karakteri döndürür. 'a' tek tırnak ile yazılır.
                newString += str.charAt(i);                    //charAt() dizinin i. karakterini döndürür. birden çok karakter
            }
        }
        System.out.println(newString);
    }
}

