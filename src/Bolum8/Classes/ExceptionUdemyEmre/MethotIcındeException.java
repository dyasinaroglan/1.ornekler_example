package Bolum8.Classes.ExceptionUdemyEmre;

public class MethotIcındeException {
    public static void main(String[] args) {
       try {
           hataOlustur();
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }

    }
    public static void hataOlustur(){
        String[] array = {"abc", "efg", null, "123"};

        for (int i = 0; i < array.length+2 ; i++) {
            try {
                int sayı = array[i].length()+ Integer.parseInt(array[i]);
                //burada dizinin lengtini bui ve dizideki elemanalrını integer'a çevir diyoruz.
            }catch (NumberFormatException e){
                System.out.println(e);
            }catch (NullPointerException e) {
                System.out.println(e);
            } //buradan array hatasını çıakrdık program sonlandı
        }
    }
}
