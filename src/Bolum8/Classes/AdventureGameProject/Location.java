package Bolum8.Classes.AdventureGameProject;

import java.util.Scanner;

public abstract class Location {
    protected Player player;  //Player den aldık çünkü player savaşacak.
    protected String name;

    Scanner scanner = new Scanner(System.in);

    public abstract boolean getLocation();

    public Location(Player player ) {
        this.player = player;

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
