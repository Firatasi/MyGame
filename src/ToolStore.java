public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldin!");
        return true;
    }
}
