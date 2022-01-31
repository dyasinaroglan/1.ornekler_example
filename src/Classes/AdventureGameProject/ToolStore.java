package Classes.AdventureGameProject;

public class ToolStore extends normalLocation{  //tool store -- alet deposu

    public ToolStore(Player player) {
        super(player, "Magaza");
    }
    public boolean getLocation(){
        System.out.println("Para : "+ player.getMoney());
        System.out.println("1.silahlar");
        System.out.println("2.zırhlar");
        System.out.println("3.çıkış");
        System.out.println("seçiminiz");
        int selectTool = scanner.nextInt(); //location da tanımlamıştık scanneri
        int selectionWeaponID ;
        switch (selectTool){
            case 1 :
                selectionWeaponID = weaponMenu();
                buyWeapon(selectionWeaponID);
                break;
            case 2 :
                selectionWeaponID = armorMenu();
                buyArmor(selectionWeaponID);

                break;
        }
        return true;
    }
    public int armorMenu(){
        System.out.println("1.Hafif\t <Para : 15 - Hasar : 1>");
        System.out.println("2.Orta\t <Para : 25 - Hasar : 3>");
        System.out.println("3.Ağır\t <Para : 40 - Hasar : 5>");
        System.out.println("4.çıkış");
        System.out.println("zırh seçiniz : ");
        int selectArmorID = scanner.nextInt();
        if (selectArmorID<1 || selectArmorID>4){
            System.out.println("lütfen geçerli bir numara seçiniz");
            int selectArmor = scanner.nextInt();
        }
        return selectArmorID;
    }
    public int weaponMenu(){
        System.out.println("1.tabanca\t <Para : 25 - Hasar : 2>");
        System.out.println("2.kılıç\t <Para : 35 - Hasar : 3>");
        System.out.println("3.tüfek\n <Para : 45 - Hasar : 7>");
        System.out.println("4.çıkış");
        System.out.println("silah seçiniz : ");
        int selectWeaponID = scanner.nextInt();
        if(selectWeaponID<1 || selectWeaponID>4){
            System.out.println("lütfen geçerli bir numara seçiniz");
            int selectWeapon = scanner.nextInt();
        }
        return selectWeaponID;
    }
    public void buyArmor(int itemID){
        int avoid =0;  //kaçınmak önlemek
        int price =0;
        String armorName = null;
        switch (itemID){
            case 1 :
                avoid = 1;
                armorName = "hafif zırh";
                price = 15;
                break;
            case 2:
                avoid = 3;
                armorName = "orta zırh";
                price =25;
                break;
            case 3:
                avoid = 5;
                armorName = "ağır zırh";
                price = 40;
                break;
        }
        if(price>0){
            if(player.getMoney()>price){
                player.getInventory().setArmor(avoid);
                player.getInventory().setArmorName(armorName);
                player.setMoney(player.getMoney()-price);
                System.out.println(armorName + "satın aldınız, engellenen hasar : " + player.getInventory().getArmorName()+ " kalan para : "+ player.getMoney());
            }
        }
    }
    public void buyWeapon(int itemID){
            int damage =0;
            int price =0;
            String weaponName = null;
            switch (itemID){
                case 1 :
                    damage = 2;
                    weaponName = "tabanca";
                    price = 25;
                    break;
                case 2:
                    damage = 3;
                    weaponName = "tüfek";
                    price = 45 ;
                    break;
                case 3 :
                    damage = 7;
                    weaponName = "kılıç";
                    price = 35;
                    break;
                case 4 :
                    System.out.println("çıkış yapılıyor");
                    break;
                default:
                    System.out.println("geçersiz işlem");
                    break;
            }
            if(price>0) {
                if (player.getMoney() > price) {
                    player.getInventory().setDamage(damage);
                    player.getInventory().setWeaponName(weaponName);
                    player.setMoney(player.getMoney() - price);
                    System.out.println(weaponName + " silah satın aldınız : " + player.getDamage() + ", yeni hasar : " + (player.getDamage() + player.getInventory().getDamage())+player.getTotalDamage());
                    System.out.println("kalan para :" + player.getMoney());
                } else {
                    System.out.println("bakiye yetersiz");
                }
            }
    }
}
