package Bolum8.Classes.Enum.Enum8;

public class Main {
    public static void main(String[] args) {
        /*
        User class tanımlayın
        nane
        statü
        role

         */
        User user = new User("ali",Statü.AKTİF,Role.ADMİN);

        if(user.getRole()==Role.ADMİN && user.getStatü()==Statü.AKTİF){

        }

    }
}
