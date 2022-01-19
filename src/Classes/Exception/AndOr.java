package Classes.Exception;

public class AndOr {
    public static void main(String[] args) {
        int i =10;
        int j= 10;
        //short Or
        if (i++ > 5 || j-- < 5){  //ilk önce i 5'ten büyük mü ona bakacak. sonra arttırıcak
            //sol taraf doğru ise sağ tarafı okumaz. 11 10 zaten çıktı.
            System.out.println(i+","+j);
        }
        int a =10;
        int b= 10;
        //bitwise Or
        if (a++ > 5 | b-- < 5){ //sol tarafı doğru olsada sağ tarafı okur.
            System.out.println(a+","+b);
        }
    }
}
