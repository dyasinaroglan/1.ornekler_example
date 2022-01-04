package Map;

import java.util.HashMap;
import java.util.Map;

public class Calısma2 {
    public static void main(String[] args) {
        HashMap<String,String> bilgiler1 = new HashMap<>();
        bilgiler1.put("email:","yasinarg@gmail.com");
        bilgiler1.put("tel","5457567343");
        bilgiler1.put("adres", "istanbul");
        bilgiler1.put("cinsiyet","erkek");

        HashMap<String,String> bilgiler2 = new HashMap<>();
        bilgiler2.put("email:","ahmetbin@gmail.com");
        bilgiler2.put("tel:","45454655");
        bilgiler2.put("adres:","izmir");
        bilgiler2.put("cinsiyet","erkek");
        Map<String,Map<String,String>> kisiBilgileri = new HashMap<>();

        kisiBilgileri.put("mehmet",bilgiler1);
        System.out.println(kisiBilgileri);

    }
}
