package HW1;

import HW1.units.BaseHero;
import HW1.units.Crossbowman;
import HW1.units.Magician;
import HW1.units.Monk;
import HW1.units.Outlaw;
import HW1.units.Peasant;
import HW1.units.Sniper;
import HW1.units.Spearman;
import HW1.units.SpeedComparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        List<BaseHero> team1 = new ArrayList<>();
        List<BaseHero> team2 = new ArrayList<>();
        int teamCount = 5;
        Random rand = new Random();
        System.out.println("Команда 1: ");
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team1.add(new Peasant(getName(), 1, i, 0));
                    break;
                case 1:
                    team1.add(new Outlaw(getName(), 1, i));
                    break;
                case 2:
                    team1.add(new Magician(getName(), 1, i));
                    break;
                case 3:
                    team1.add(new Sniper(getName(), 1, i));
                    break;
            }
            System.out.println(team1.get(i).getInfo());
        }
        System.out.println("Команда 2: ");
        for (int i = 0; i < teamCount; i++) {
            int val1 = rand.nextInt(4);
            switch (val1) {
                case 0:
                    team2.add(new Peasant(getName(), 10, i, 1));
                    break;
                case 1:
                    team2.add(new Spearman(getName(), 10, i));
                    break;
                case 2:
                    team2.add(new Monk(getName(), 10, i));
                    break;
                case 3:
                    team2.add(new Crossbowman(getName(), 10, i));
                    break;
            }
            System.out.println(team2.get(i).getInfo());
        }
        
        List<BaseHero> queue = new ArrayList<>();
        queue.addAll(team1);
        queue.addAll(team2);
        queue.sort(new SpeedComparator().reversed());
        System.out.println("Sorted by speed");
        queue.forEach(hero -> System.out.println(hero.getInfo()));
    }

    public static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}
