package Classes.AdventureGameProject;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Player player;
    Location location;
    Inventory inventory;  //envanter

    /*public Game(Player player, Location location, Inventory inventory) {
        this.player = player;
        this.location = location;
        this.inventory = inventory;
    }

     */


    public void login() {  //login--giriş yapmak
        Scanner scanner = new Scanner(System.in);
        System.out.println("Macera oyununa hoşgeldiniz");
        System.out.println("oyuna başlamadan önce lütfen isminizi giriniz");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        player.selectCharacter();
        start();
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("==================================");
            System.out.println("eylem gerçekleştirmek için bir yer seçiniz");
            System.out.println("1.GÜVENLİ EV ---> size ait güvenli bir mekan,düşman yok!");
            System.out.println("2.MAĞARA ---> Karşınıza ZOMBİ çıkabilir");
            System.out.println("3.ORMAN ---> Karşınıza VAMPİR çıkabilir");
            System.out.println("4.NEHİR ---> Karşınıza AYI çıkabilir");
            System.out.println("5.MAĞAZA ---> silah veya zırh alabilirsiniz");
            System.out.println("gitmek istediğiniz yer");
            int selectLocation = scanner.nextInt();
            while (selectLocation < 0 || selectLocation > 5) {
                System.out.println("lütfen geçerli bir yer seçiniz");
                selectLocation = scanner.nextInt(); //tekrar bize sorması için
            }
            switch (selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2 :
                    location = new Cave(player);
                    break;
                case 5 :
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
          if (!location.getLocation()){
              System.out.println("oyun bitti");
              break;
          }
        }
    }
}





