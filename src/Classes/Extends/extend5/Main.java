package Classes.Extends.extend5;

import Classes.Extends.extend4.ChildClass;

public class Main {

    static {
        System.out.println("main static initilaizer");
    }
    public static void main(String[] args) {
        System.out.println("main başladı");
        Classes.Extends.extend4.ChildClass c = new ChildClass();
        System.out.println("main bitti");
    }
}
/*
EXTEND ETTĞİMİZ DURUMDA ParentClass ı ChildClass a extend ettiğimizde
           1.main içindeki staticleri okur.
           2sonra main başladı der.
           3. child geldiğinde bu sefer extend olduğu için
           parent ın static okur sonrada kendi statiğini okur.
           4.parentClass ın instance initilaizeri okunur
           5. ChildClass ın instance initiliaziri ıokunur.
           6.parentClass consttructor okunur
           7.ChildClass ın constructor u okunur.
           8. ve en son main bitti okunur.

 */
