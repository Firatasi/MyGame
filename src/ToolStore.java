public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldin!");
        System.out.print("Yapmak istediğiniz işlem: ");
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış");


        int selectCase = input.nextInt();
        while (selectCase < 1 && selectCase > 3) {
            System.out.print("Lütfen geçerli bir değer giriniz: ");
            selectCase = input.nextInt();
        }



        return true;
    }
}
