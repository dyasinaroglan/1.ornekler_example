package Classes.AdventureGameProject;

import java.util.Locale;

public abstract class BattleLocation extends Location {
   protected Obstacle obstacle;  // obstacle-->canavar

    public BattleLocation(Player player, String name, Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }
    public boolean getLocation(){
        int obsCount = obstacle.obstacleCount();
        System.out.println("şu an buradasınız :" + this.getName());
        System.out.println("dikkatli ol! burada "+ obsCount + " tane "+ obstacle.getName()+ " yaşıyor.");
        System.out.println();
        System.out.println("<S>avaş veya <K>aç");
        String selectCase = scanner.nextLine();
        selectCase = selectCase.toUpperCase(Locale.ROOT);
        if(selectCase.equals("S")) {
            if (combat(obsCount) == true) {
                System.out.println(this.getName() + " bölgesindeki tüm düşmanları temizlediniz");
                return true;
            } else {
                System.out.println("öldünüz");
                return false;
            }
        }
        return true;

    }

    public boolean combat(int obsCount){
        for (int i = 0; i < obsCount; i++) {
            playerStats();
            enemyStats();
            while (player.getrHealthy()>0 && obstacle.getHealthy()>0){
                System.out.println("<V>ur veya <K>aç");
                String selectCase = scanner.nextLine();
                selectCase = selectCase.toUpperCase(Locale.ROOT);
                if (selectCase.equals("V")){
                    System.out.println("siz vurdunuz");
                    obstacle.setHealthy(obstacle.getHealthy()- player.getTotalDamage());
                    System.out.println("oyuncu canı : "+ player.getrHealthy());
                    System.out.println(obstacle.getName() + " canavar canı : "+ obstacle.getHealthy());
                    System.out.println("canavar size vurdu");
                    player.setrHealthy(player.getHealthy()-(obstacle.getDamage()-player.getInventory().getArmor()));


                }


            }


        }
        return true;
    }
    public void playerStats(){  //oyuncu istatistikleri
        System.out.println("Oyuncu Değerleri\n");
        System.out.println("Can : "+ player.getHealthy());
        System.out.println("Hasar : "+ player.getTotalDamage());
        System.out.println("Para : "+ player.getMoney());
        if(player.getInventory().getArmor()>0){
            System.out.println("Zırh : "+ player.getInventory().getArmorName());
        }
    }
    public void enemyStats(){ //düşman istatistikleri
        System.out.println(obstacle.getName() + " değerleri\n");
        System.out.println("Can : "+ obstacle.getHealthy());
        System.out.println("Hasar : " + obstacle.getDamage() );
        System.out.println("Ödül : " + obstacle.getAward()); //award--ödül

    }
}
