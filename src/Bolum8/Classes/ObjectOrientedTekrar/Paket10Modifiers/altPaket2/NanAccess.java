package Bolum8.Classes.ObjectOrientedTekrar.Paket10Modifiers.altPaket2;

import java.util.ArrayList;

public class NanAccess {

    final static int a = 1;
    final int b = 2;
    final int bb;
    final int cc; //bu şekilde değer vermezsem mutlaka constructor da ya da boş bir yerde initiliaze etmem lazım.
    final ArrayList<Integer> list = new ArrayList<>();

    {
        cc = 2;
    }
    public NanAccess(){
        bb = 10;
    }
    public void deneme(){
       // b= 3; bunu yapamam
        list.add(4); //bu şekilde ekleme çıkarma yapabilirim.içinde değişiklik yapabilirim.
        //ancak
        //list = new ArrayList<>(); bunu yapamam. ismini değiştiremem.


    }
}
