package Bolum8.Classes.AdventureGameProject;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(player, "CAVE", new Zombi());
    }
}
