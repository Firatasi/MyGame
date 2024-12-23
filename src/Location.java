public abstract class Location {
    private Player player;
    private String name;

    public Location(Player player, String name) {
        this.player = player;
    }

    abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }




}
