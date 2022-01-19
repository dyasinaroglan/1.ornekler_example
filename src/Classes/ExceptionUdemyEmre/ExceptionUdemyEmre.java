package Classes.ExceptionUdemyEmre;

public class ExceptionUdemyEmre {

    public static void main(String[] args) {


        try {
            int[] sayılar ={1,2,3};
            System.out.println(""+sayılar[5]);
        }catch (Exception e){
            System.out.println("hataaaaa\n" +e.toString());
        }

        System.out.println("***********************************");

        try {
            Integer integer;
            integer = new Integer("ASD");
            System.out.println(integer);
        } catch (Exception e){
            System.out.println("hata çıktı = "+ e.toString());
        }
        System.out.println("program buradan devam etmeli");
    }
    int[] sayılar ={1,2,3};


}
