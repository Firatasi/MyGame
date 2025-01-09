public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldin!");
        System.out.println("Yapmak istediğiniz işlem: ");
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış");


        int selectCase = input.nextInt();

        if ((selectCase < 1) && (selectCase>3)) {
            System.out.print("Lütfen geçerli bir değer giriniz: ");
            selectCase = input.nextInt();
        }else if(selectCase == 1) {
            printWeapon();
        }else if(selectCase == 2) {
            printArmor();
        }else if(selectCase == 3) {
            System.out.println("İyi günler !");
        }

        return true;

    }

    public  void printWeapon() {
        System.out.println("****Silahlar****");
        System.out.println();
        for (Weapon  w : Weapon.weapons()) {
            System.out.println(w.getId() + " * " + w.getName() + "  <Para: " + w.getPrice()+ ">" + " ,  <Hasar: " + w.getDamage() + ">");
        }
        System.out.print("Silah seçiniz: ");
        int selectWeaponId = input.nextInt();
        if ((selectWeaponId< 1) && (selectWeaponId>Weapon.weapons().length)) {
            System.out.print("Lütfen geçerli bir değer giriniz: ");
            selectWeaponId = input.nextInt();
        }
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponId);
        if ( selectedWeapon!= null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Bakiye yetersiz! ");
            }else {
                System.out.println(selectedWeapon.getName() + "Silahını satın aldınız. ");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Bakiye: " + this.getPlayer().getMoney());
            }
        }

    }

    public void printArmor() {

    }

}
