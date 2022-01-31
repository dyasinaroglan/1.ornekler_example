package Classes.AdventureGameProject;

import java.util.Scanner;

public class Player {
    private int damage, healthy,money,rHealthy;  //(damage--hasar)
    private String name, characterName;
    Inventory inventory;  //envanter
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }
    public void selectCharacter(){
       switch (characterMenu()){
           case 1 :
               setcName("SAMURAY");
               setDamage(5);
               setHealthy(21);
               setMoney(15);
               setrHealthy(healthy);
               break;
           case 2 :
               setcName("OKÇU");
               setDamage(7);
               setHealthy(18);
               setMoney(20);
               setrHealthy(healthy);
               break;
           case 3 :
               setcName("ŞÖVALYE");
               setDamage(8);
               setHealthy(24);
               setMoney(5);
               setrHealthy(healthy);
               break;
           default:
               setcName("SAMURAY");
               setDamage(5);
               setHealthy(21);
               setMoney(15);
               setrHealthy(healthy );
               break;
       }
        System.out.println("Karakter : "+  getcName()+ "\t Hasar : "+ getDamage()+ "\t Sağlık :" + getHealthy()+ "\t Para : "+ getMoney());

    }
    public int characterMenu(){
        System.out.println("lütfen bir karakter seçiniz");
        System.out.println("Karakter Türü : \n1.SAMURAY--> Hasar: 5 \t Sağlık: 21 \t Para: 15 ");
        System.out.println("2.OKÇU--> Hasar: 7 \t Sağlık: 18 \t Para: 20");
        System.out.println("3.ŞÖVALYE--> Hasar: 8 \t Sağlık: 24 \t Para: 5");
        System.out.println("====================================");
        System.out.println("Karakter Seçiniz");
        int characterNo = scanner.nextInt();
        System.out.println("====================================");
        while (characterNo<1 || characterNo>3){
            System.out.println("lütfen geçerli bir karakter giriniz!");
           characterNo = scanner.nextInt();
        }
        return characterNo;
    }
    public int getTotalDamage(){
        return this.getDamage()+ this.getInventory().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return characterName;
    }

    public void setcName(String cName) {
        this.characterName = cName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }
}
