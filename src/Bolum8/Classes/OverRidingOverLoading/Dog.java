package Bolum8.Classes.OverRidingOverLoading;

public class Dog extends Animal{


    void speak() {
        System.out.println("dogs bark");
    }
}

    /*
     OVERRİDİNG
     Üst sınıf tarafından alt sınıfa miras bırakılan metodların alt sınıftan bir obje yaratılarak erişilebildiğini daha önce öğrenmiştik.
     Bazı durumlarda üst sınıf tarafında kalıtımla alt sınıflara miras bırakılan metodlar alt sınıfın ihtiyacını tam olarak karşılayamazlar.
     Bu durumda bu metodun alt sınıfta onun kendi ihtiyacına uygun olarak tekrardan yazılması gerekir.
     Burada önemli olan metod imazsının aynen korunmasıdır. metot isminin aynı kalması önemli tabi
     Bu noktada alt sınıftan yaratılan obje artık üst sınıfın metodunu değil kendi metodunu kullanabilecektir.
     İşte bu olaya üst sınıfın metodunu ezme yani method overriding denir.

     OVERLOADİNG
     Method overloading ise aynı sınıf yada üst sınıfta yer alan bir metodun ismini korumak şartıyla imzasının değiştirilerek
     farklı şekilde implemente edilmesidir.
     Method overriding olabilmesi için kalıtımın olması ve override edilen metodun imzası değiştirilmeden sadece implementasyon kısmının değişmesi şarttır.
     Fakat overloading olması için kalıtım olması şart değildir, metodun imzasının değişmesi yeterlidir (metod ismi aynı kalmalı).
   */
