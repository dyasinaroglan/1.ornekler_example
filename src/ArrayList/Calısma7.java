package ArrayList;

import java.util.ArrayList;

public class Calısma7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        Integer num = 600;
        boolean r= list.remove(num);
        System.out.println(list);
        System.out.println("----------------------");
        System.out.println("uzunluk="+list.size());
        int lastIndex = list.size()-1;
        System.out.println("index sayısı="+lastIndex);
        System.out.println("---------------------------");
        list.clear();
        System.out.println(list);

        System.out.println(list.size());
        System.out.println("------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('A');

        System.out.println(characters.indexOf('A'));
        System.out.println(characters.indexOf('C'));
        System.out.println(characters.lastIndexOf('D'));
        System.out.println("-------------------------------");
        boolean r1 = characters.contains('A');
        boolean r2 = characters.contains('B');
        System.out.println("r1:"+ r1);
        System.out.println("r2:"+r2);
        System.out.println("----------------------------------");

        ArrayList<Integer> liste2 = new ArrayList<>();

        liste2.add(100);
        liste2.add(100);
        liste2.add(100);

        ArrayList<Integer> liste3 = new ArrayList<>();
        liste3.add(100);
        liste3.add(100);
        liste3.add(100);

        System.out.println(liste2==liste3);
        System.out.println(liste2.equals(liste3)); //var mı yok mu?

        liste2.clear();

        boolean r4 = liste2.isEmpty();
        System.out.println(r4);



    }
}
