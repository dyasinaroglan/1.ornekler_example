package Methods;

public class Calısma01 {
    public static void main(String[] args) {
        //iki sayıdan büyük olanı yazdıran programı metot kullanarak yazdırınız.

        int a =12;
        int b=24;

        enBüyükSayı(56,45);
        enBüyükSayı(a,b); //gördüğümüz gibi methodun içerisindeki parametre ile dışardan aldığmız değişkenler aynı olmak zorunda değil.

    }
    public static void enBüyükSayı (int num1,int num2){ //parametreler farklı değişkenler alabilir. aynı tipte olmak zorunda değil
                                                           //ve istediğimiz kadar parametre yazabiliriz.
        if (num1>num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
