package HW1;

import HW1.units.BaseHero;
import HW1.units.Crossbowman;
import HW1.units.Magician;
import HW1.units.Monk;
import HW1.units.Outlaw;
import HW1.units.Peasant;
import HW1.units.Sniper;
import HW1.units.Spearman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        List<BaseHero> teams = new ArrayList<>();
        int teamCount = 10;
        Random rand = new Random();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            switch (val) {
                case 0:
                    teams.add(new Peasant(String.format("Peasant %d", i+1)));
                    break;
                case 1:
                    teams.add(new Crossbowman(String.format("Crossbowman %d", i+1)));
                    break;
                case 2:
                    teams.add(new Magician(String.format("Magician %d", i+1)));
                    break;
                case 3:
                    teams.add(new Monk(String.format("Monk %d", i+1)));
                    break;
                case 4:
                    teams.add(new Outlaw(String.format("Outlaw %d", i+1)));
                    break;
                case 5:
                    teams.add(new Sniper(String.format("Sniper %d", i+1)));
                    break;
                case 6:
                    teams.add(new Spearman(String.format("Spearman %d", i+1)));
                    break;
            }
            System.out.println(teams.get(i).getInfo());
        }

    }

}
