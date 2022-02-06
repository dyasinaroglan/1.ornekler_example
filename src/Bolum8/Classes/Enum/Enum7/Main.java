package Bolum8.Classes.Enum.Enum7;

public class Main {
    public static void main(String[] args) {

        for (Aylar aylar : Aylar.values()){
            System.out.print(aylar.name()+",");
        }
        System.out.println();
        System.out.println("-------------------------");

        Aylar[] arr = Aylar.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name()+",");
            
        }

    }
}
