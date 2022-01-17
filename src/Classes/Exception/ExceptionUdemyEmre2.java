package Classes.Exception;

public class ExceptionUdemyEmre2 {
    public static void main(String[] args) {

        String[] array = {"abc", "efg", null, "123"};
        for (int i = 0; i < array.length + 2; i++) {

            //array in 3 indisli fakat sen +2 yapmışsın hata veriyor.  -----  ArrayIndexOutOfBoundsException

            try {
                int sayı = array[i].length() + Integer.parseInt(array[i]); //uygun ıolmayan string bir ifadeyi int e çeviremezsin diyor.
                // NumberFormatException hatası
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("********buradan devam**********");
        for (int i = 0; i < array.length+2; i++) {
            try {
                int sayı = array[i].length();
                try {
                    Integer.parseInt(array[i]);
                }catch (NumberFormatException e){
                    System.out.println("hata çıktı = "+ e);

                }
            }catch (NullPointerException e){
                System.out.println("yine hata çıktı = "+e);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("yine hata çıktı = "+e);

            }

        }
        ;

    }

        }


