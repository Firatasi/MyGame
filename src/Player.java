import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);


    public  Player(String name) {
        this.name = name;
    }
    public void selectChar() {

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("*************************************************************");

        for (GameChar gameChar: charList) {

            System.out.println("ID: " +gameChar.getId() +
                    "\t Karakter: "+gameChar.getName() +
                    "\t Hasar: "+gameChar.getDamage() +
                    "\t Sağlık: "+gameChar.getHealth() +
                    "\t Para: "+gameChar.getMoney());
        }

        System.out.println("*************************************************************");
        System.out.print("Lütfen bir karakter seçiniz: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
            initPlayer(new Samurai());
                 break;

            case 2:
                initPlayer(new Archer());
                break;

            case 3:
                initPlayer(new Knight());
                break;

            default:
                System.out.println("Lütfen geçerli bir değer giriniz! ");
        }

        System.out.println("Karakter: " + this.getCharName() +"  -   " + "Hasar: " + this.getDamage() +"  -   "+ " Sağlık: " + this.getHealth()+ "  -   " + " Para: " + this.getMoney());

    }

    public void selectLoc() {
        Location location = null;

        System.out.println("Bölgeler");
        System.out.println("1-Güvenli ev");
        System.out.println("2-Mağaza");
        System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
        int selectLoc = input.nextInt();

        switch (selectLoc) {
            case 1:
                location = new SafeHouse(this);
                break;

            case 2:
                location = new ToolStore(this);
                break;

            default:
                location = new SafeHouse(this);
        }
        
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharname(gameChar.getName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money=money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharname(String charName) {
        this.charName = charName;
    }

}
