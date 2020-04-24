package weekFive.Exercise090;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> team;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.team = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.size() < maxSize) {
            this.team.add(player);
        }
    }

    public void printPlayers(ArrayList<Player> players) {
        for (Player i : players) {
            System.out.println(i.toString());
        }
    }

    public void setMaxSize(int size) {
        this.maxSize = size;
    }

    public int size() {
        return this.team.size();
    }

    public int goals() {
        int sum = 0;

        for (Player i : this.team) {
            sum += i.goals();
        }
        return sum;
    }
}
