package algoritma;

public class _03Examp {
    public static void main(String[] args) {

        //Verilen bir String ifade de harfler dışındaki rakam ve karakterleri bulan program

        String ifade = "abd345fgy3478945";

        int i,j;

        for (i = 0; i < ifade.length(); i++) {
            for (j = 48; j<=57; j++){
                if(ifade.charAt(i) == j){
                    System.out.print(ifade.charAt(i));
                }
            }
        }
    }
}
