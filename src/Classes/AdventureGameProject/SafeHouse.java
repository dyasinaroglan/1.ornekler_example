package Classes.AdventureGameProject;

public class SafeHouse extends normalLocation{

    String location;

    public SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }


    public boolean getLocation(){
        player.setHealthy(player.getrHealthy());
        System.out.println("iyileştiniz...");
        System.out.println("şu an güvenli evdesiniz");
        return true;
    }
}
