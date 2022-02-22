package Bolum5.ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);

        num.add(2,100); // TODO: 22.02.2022 2.index i 100 olarak değiştirdim
        // TODO: 22.02.2022 2.indis ilk başta 30 rakamı idi 30 bir geriye gitmiş oldu. silinme falan yok ekleme yaptım.
        System.out.println(num);

        int lastIndex = num.size()-1;
        System.out.println(lastIndex);
        int getir = num.get(3);
        System.out.println(getir);
        System.out.println("********************");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " "); // TODO: 22.02.2022  normal array değil bu num[i] olmaz---num.get(i) diyerek çağırıyoruz.
        }
        System.out.println();
        System.out.println("********************");

            ArrayList<String>employees = new ArrayList<>();
            employees.add("java");
            employees.add("HTML");
            employees.add("phyton");
            employees.add("java script");
            employees.add("C#");
            employees.add("rubby");
            employees.add("flutter");

            employees.set(3,"HTML"); // TODO: 22.02.2022 3.indixi html ile değiştirdim

            System.out.print(employees);
    }
}
