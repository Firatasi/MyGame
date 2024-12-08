import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Hoşgeldiniz! ");
        System.out.print("Lütfen Bir isim Giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " Hoşgeldiniz! ");
        System.out.println("Oyuna başlamak için bir karakter seçiniz! ");
        player.selectChar();
    }
}
